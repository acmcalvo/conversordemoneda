package com.alura.conversordemodeda.principal;

import com.alura.conversordemodeda.modelos.CurrencyConverter;
import com.alura.conversordemodeda.modelos.ExchangeRateService;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ExchangeRateService exchangeRateService = new ExchangeRateService();
        CurrencyConverter converter = new CurrencyConverter(exchangeRateService);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("**********************");
            System.out.println("\nSelecciona la conversión:");
            System.out.println("1. Dólar ==> Peso Argentino");
            System.out.println("2. Peso Argentino ==> Dóllar");
            System.out.println("3. Dólar ==> Real Brasileño");
            System.out.println("4. Real Brasileño ==> Dólar");
            System.out.println("5. Dólar ==> Peso Colombiano");
            System.out.println("6. Peso Colombiano ==> Dólar");
            System.out.println("7. Dólar ==> Colon Costa Rica");
            System.out.println("8. Salir");
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
                        System.out.println("Equivalente en pesos argentinos: " + resultArs);
                        pressEnterToContinue();
                        break;
                    case 2:
                        System.out.print("Ingresa la cantidad en pesos argentinos: ");
                        double arsToMx = scanner.nextDouble();
                        double resultMx = converter.convertPesosArgentinosToDollars(arsToMx);
                        System.out.println("Equivalente en dólares: " + resultMx);
                        pressEnterToContinue();
                        break;
                    case 3:
                        System.out.print("Ingresa la cantidad en dólares: ");
                        double dollarsToBrl = scanner.nextDouble();
                        double resultBrl = converter.convertDollarsToRealesBrasilenos(dollarsToBrl);
                        System.out.println("Equivalente en reales brasileños: " + resultBrl);
                        pressEnterToContinue();
                        break;
                    case 4:
                        System.out.print("Ingresa la cantidad en reales brasileños: ");
                        double brlToUsd = scanner.nextDouble();
                        double resultUsdFromBrl = converter.convertRealesBrasilenosToDollars(brlToUsd);
                        System.out.println("Equivalente en dólares: " + resultUsdFromBrl);
                        pressEnterToContinue();
                        break;
                    case 5:
                        System.out.print("Ingresa la cantidad en dólares: ");
                        double dollarsToCop = scanner.nextDouble();
                        double resultCop = converter.convertDollarsToPesosColombianos(dollarsToCop);
                        System.out.println("Equivalente en pesos colombianos: " + resultCop);
                        pressEnterToContinue();
                        break;
                    case 6:
                        System.out.print("Ingresa la cantidad en pesos colombianos: ");
                        double copToUsd = scanner.nextDouble();
                        double resultUsdFromCop = converter.convertPesosColombianosToDollars(copToUsd);
                        System.out.println("Equivalente en dólares: " + resultUsdFromCop);
                        pressEnterToContinue();
                        break;
                    case 7:
                        System.out.print("Ingresa la cantidad en colones Costa Rica: ");
                        double crcToUsd = scanner.nextDouble();
                        double resultCrc = converter.convertColonesCostaRicatoDollars(crcToUsd);
                        System.out.println("Equivalente en dólares: " + resultCrc);
                        pressEnterToContinue();
                        break;
                    case 8:
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
