package br.com.saojudas.at02;

import java.util.Scanner;

public class TeoremaPitagoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do cateto oposto: ");
        double catO = scanner.nextDouble();

        System.out.print("Insira o valor do cateto adjacente: ");
        double catA = scanner.nextDouble();

        double hip = Math.sqrt(Math.pow(catO, 2) + Math.pow(catA, 2));

        System.out.printf("\nValor da hipotenusa: %.2f", hip);

        scanner.close();
    }
}
