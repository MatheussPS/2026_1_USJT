package br.com.saojudas.at03;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de reais em dólares\n");

        System.out.print("Insira o valor em real: ");
        double real = scanner.nextDouble();

        double cotacaoDolar = 5.0;
        double dolar = real/cotacaoDolar;

        System.out.printf("\nDólares: %.2f", dolar);

        scanner.close();
    }
}

