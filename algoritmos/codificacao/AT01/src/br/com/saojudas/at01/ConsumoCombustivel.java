package br.com.saojudas.at01;

import java.util.Scanner;

public class ConsumoCombustivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a distância percorrida(km): ");
        double km = scanner.nextDouble();

        System.out.print("Insira o consumo do combustivel(l): ");
        double litros = scanner.nextDouble();

        double consumo = km/litros;

        System.out.printf("\nConsumo Medio: %.1f km/l", consumo);

        scanner.close();
    }
}
