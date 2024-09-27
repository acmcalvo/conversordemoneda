package com.alura.conversordemodeda.modelos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ExchangeRateService {
    private final String apiKey = "25c7cf0caf019d15c3fcfa3b";
    private final String apiUrl = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/";

    public double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        String requestUrl = apiUrl + fromCurrency + "/" + toCurrency;
        URL url = new URL(requestUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        if (status != 200) {
            throw new RuntimeException("Error en la API: " + status);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();

        JSONObject jsonResponse = new JSONObject(content.toString());
        return jsonResponse.getDouble("conversion_rate");
    }
}
