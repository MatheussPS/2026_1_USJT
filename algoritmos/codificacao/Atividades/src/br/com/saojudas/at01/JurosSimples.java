package br.com.saojudas.at01;

import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o capital inicial: ");
        double capital = scanner.nextDouble();

        System.out.print("Insira a taxa: ");
        double taxa = scanner.nextDouble();

        System.out.print("Insira o tempo(meses): ");
        double tempo = scanner.nextDouble();

        double montante = capital + (capital*taxa*tempo);

        System.out.printf("\nMontante: %.2f", montante);

        scanner.close();
    }
}
