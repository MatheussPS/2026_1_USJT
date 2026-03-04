package br.com.saojudas.at01;

import java.util.Scanner;

public class ConversaoTermica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a temperatura(Fahrenheit): ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit-32)*5/9;

        System.out.printf("\nConversão para Celsius %.2f",celsius);
        scanner.close();
    }
}
