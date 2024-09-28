package com.alura.conversordemodeda.modelos;

public class CurrencyConverter {
    private ExchangeRateService exchangeRateService;

    public CurrencyConverter(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) throws Exception {
        double rate = exchangeRateService.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }


    // Conversiones
    public double convertDollarsToPesosArgentinos(double dollars) throws Exception {
        return convert("USD", "ARS", dollars);
    }

    public double convertPesosArgentinosToDollars(double pesosArgentinos) throws Exception {
        return convert("ARS", "USD", pesosArgentinos);
    }

    public double convertDollarsToRealesBrasilenos(double dollars) throws Exception {
        return convert("USD", "BRL", dollars);
    }

    public double convertRealesBrasilenosToDollars(double reales) throws Exception {
        return convert("BRL", "USD", reales);
    }

    public double convertDollarsToPesosColombianos(double dollars) throws Exception {
        return convert("USD", "COP", dollars);
    }

    public double convertPesosColombianosToDollars(double pesosColombianos) throws Exception {
        return convert("COP", "USD", pesosColombianos);
    }

//    Metodo extra Costa Rica
public double convertColonesCostaRicatoDollars(double colonesCostaRica) throws Exception {
    return convert("CRC", "USD", colonesCostaRica);
}
    public double converDollarsToColonesCostaRica(double colonesCostaRica) throws Exception {
        return convert("USD", "CRC", colonesCostaRica);
    }

    }


