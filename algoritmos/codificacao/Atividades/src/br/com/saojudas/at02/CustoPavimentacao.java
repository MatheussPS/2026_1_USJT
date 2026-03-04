package br.com.saojudas.at02;

import java.util.Scanner;

public class CustoPavimentacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o raio da praça: ");
        double raio = scanner.nextDouble();

        System.out.print("Insira o valor do metro: ");
        double metro = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double custo = area * metro;

        System.out.printf("\nÁrea total: %.2f", area);
        System.out.printf("\nCusto do material: %.2f reais", custo);

        scanner.close();
    }
}
