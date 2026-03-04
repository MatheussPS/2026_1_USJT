package br.com.saojudas.at02;

import java.util.Scanner;

public class ConversorMoedasViagens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de reais em dólares\n");

        System.out.print("Insira o valor em real: ");
        double real = scanner.nextDouble();

        double cotDolar = 5.2;
        double dolar = real/cotDolar;

        System.out.printf("\nDólares: %.2f", dolar);

        scanner.close();
    }
}

