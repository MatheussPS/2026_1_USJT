package br.com.saojudas.at03;

import java.util.Scanner;

public class TranformacaoBaseTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor em segundos: ");
        int segEntrada = scanner.nextInt();

        int resto = segEntrada%3600;
        int hora = segEntrada/3600;
        int minuto = resto/60;
        int segundo = resto%60;

        System.out.printf("\n%dh %dm %ds", hora, minuto, segundo);

        scanner.close();
    }
}
