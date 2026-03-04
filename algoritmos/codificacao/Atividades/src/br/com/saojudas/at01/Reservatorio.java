package br.com.saojudas.at01;

import java.util.Scanner;

public class Reservatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o raio da base: ");
        double raio = scanner.nextDouble();

        System.out.print("Insira a altura: ");
        double altura = scanner.nextDouble();

        double volume = (3.14*raio*raio*altura)*1000;

        System.out.printf("\nVolume do cilindro em m3: %.2f", volume/1000);

        System.out.printf("\nVolume do cilindro em Litros: %.2f", volume);


        scanner.close();
    }
}
