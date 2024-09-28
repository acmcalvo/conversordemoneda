package com.alura.conversordemodeda.principal;

import com.alura.conversordemodeda.modelos.CurrencyConverter;
import com.alura.conversordemodeda.modelos.ExchangeRateService;

import java.text.DecimalFormat;  // Importa DecimalFormat
import java.util.Scanner;

public class Principal {
    // Crea una instancia de DecimalFormat para limitar los decimales a 5
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00000");

    public static void main(String[] args) {
        ExchangeRateService exchangeRateService = new ExchangeRateService();
        CurrencyConverter converter = new CurrencyConverter(exchangeRateService);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("**********************");
            System.out.println("\nSelecciona la conversión:");
            System.out.println("1. Dólar ==> Peso Argentino");
            System.out.println("2. Peso Argentino ==> Dólar");
            System.out.println("3. Dólar ==> Real Brasileño");
            System.out.println("4. Real Brasileño ==> Dólar");
            System.out.println("5. Dólar ==> Peso Colombiano");
            System.out.println("6. Peso Colombiano ==> Dólar");
            System.out.println("7. Dólar ==> Colon Costa Rica");
            System.out.println("8. Colon Costa Rica ==> Dólar");
            System.out.println("10. Salir");
            System.out.println("Elija una opción valida:");
            System.out.println("**********************");

            int option = scanner.nextInt();

            try {
                System.out.println("**********************");
                switch (option) {
                    case 1:
                        System.out.print("Ingresa la cantidad en dólares: ");
                        double dollarsToArs = scanner.nextDouble();
                        double resultArs = converter.convertDollarsToPesosArgentinos(dollarsToArs);
                        // Formatear el resultado a 3 decimales
                        System.out.println("Equivalente en pesos argentinos: " + decimalFormat.format(resultArs));
                        pressEnterToContinue();
                        break;
                    case 2:
                        System.out.print("Ingresa la cantidad en pesos argentinos: ");
                        double arsToDollars = scanner.nextDouble();
                        double resultDollars = converter.convertPesosArgentinosToDollars(arsToDollars);
                        System.out.println("Equivalente en dólares: " + decimalFormat.format(resultDollars));
                        pressEnterToContinue();
                        break;
                    case 3:
                        System.out.print("Ingresa la cantidad en dólares: ");
                        double dollarsToBrl = scanner.nextDouble();
                        double resultBrl = converter.convertDollarsToRealesBrasilenos(dollarsToBrl);
                        System.out.println("Equivalente en reales brasileños: " + decimalFormat.format(resultBrl));
                        pressEnterToContinue();
                        break;
                    case 4:
                        System.out.print("Ingresa la cantidad en reales brasileños: ");
                        double brlToUsd = scanner.nextDouble();
                        double resultUsdFromBrl = converter.convertRealesBrasilenosToDollars(brlToUsd);
                        System.out.println("Equivalente en dólares: " + decimalFormat.format(resultUsdFromBrl));
                        pressEnterToContinue();
                        break;
                    case 5:
                        System.out.print("Ingresa la cantidad en dólares: ");
                        double dollarsToCop = scanner.nextDouble();
                        double resultCop = converter.convertDollarsToPesosColombianos(dollarsToCop);
                        System.out.println("Equivalente en pesos colombianos: " + decimalFormat.format(resultCop));
                        pressEnterToContinue();
                        break;
                    case 6:
                        System.out.print("Ingresa la cantidad en pesos colombianos: ");
                        double copToUsd = scanner.nextDouble();
                        double resultUsdFromCop = converter.convertPesosColombianosToDollars(copToUsd);
                        System.out.println("Equivalente en dólares: " + decimalFormat.format(resultUsdFromCop));
                        pressEnterToContinue();
                        break;
                    case 7:
                        System.out.print("Ingresa la cantidad en dólares: ");
                        double usdToCrc = scanner.nextDouble();
                        double resultCrcFromUsd = converter.converDollarsToColonesCostaRica(usdToCrc);
                        System.out.println("Equivalente en colones costarricenses: " + decimalFormat.format(resultCrcFromUsd));
                        pressEnterToContinue();
                        break;
                    case 8:
                        System.out.print("Ingresa la cantidad en colones costarricenses: ");
                        double crcToUsd = scanner.nextDouble();
                        double resultUsdFromCrc = converter.convertColonesCostaRicatoDollars(crcToUsd);
                        System.out.println("Equivalente en dólares: " + decimalFormat.format(resultUsdFromCrc));
                        pressEnterToContinue();
                        break;
                    case 10:
                        exit = true;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                        pressEnterToContinue();
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
                pressEnterToContinue();
            }
        }

        scanner.close();
    }

    // Método para esperar a que el usuario presione Enter
    private static void pressEnterToContinue() {
        System.out.println("Presiona Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // Espera la entrada del usuario (Enter)
    }
}
