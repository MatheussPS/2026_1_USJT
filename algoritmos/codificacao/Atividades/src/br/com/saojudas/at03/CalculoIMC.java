package br.com.saojudas.at03;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu peso(kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Insira sua altura(m2): ");
        double altura = scanner.nextDouble();

        double imc = (peso)/Math.pow(altura, 2);

        System.out.printf("Seu IMC é: %.2f", imc);

        scanner.close();
    }
}
