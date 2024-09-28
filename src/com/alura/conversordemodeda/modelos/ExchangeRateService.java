package com.alura.conversordemodeda.modelos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import io.github.cdimascio.dotenv.Dotenv;
import org.json.JSONObject;

public class ExchangeRateService {
 private final String apiKey;
    private final String apiUrl = "https://v6.exchangerate-api.com/v6/";

    public ExchangeRateService() {
        // Cargamos el archivo .env
        Dotenv dotenv = Dotenv.load();
        this.apiKey = dotenv.get("EXCHANGE_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            throw new RuntimeException("API key is missing. Ensure EXCHANGE_API_KEY is set in .env file.");
        }
    }

//    public double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
//        String requestUrl = apiUrl + fromCurrency + "/" + toCurrency;
public double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
    String requestUrl = apiUrl + apiKey + "/pair/" + fromCurrency + "/" + toCurrency;
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
