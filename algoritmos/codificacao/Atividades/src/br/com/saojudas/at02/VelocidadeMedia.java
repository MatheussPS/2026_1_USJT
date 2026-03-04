package br.com.saojudas.at02;

import java.util.Scanner;

public class VelocidadeMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a distância percorrida(km): ");
        double km = scanner.nextDouble();

        System.out.print("Insira o tempo gasto(h): ");
        double h = scanner.nextDouble();

        double vm = km/h;

        System.out.printf("\nVelocidade Média: %.2f km/h", vm);

        scanner.close();
    }
}
