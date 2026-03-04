package br.com.saojudas.at02;

import java.util.Scanner;

public class VolumeSiloCilindrico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o raio do silo: ");
        double raio = scanner.nextDouble();

        System.out.print("Insira a altura do silo: ");
        double altura = scanner.nextDouble();

        double vol = Math.PI * Math.pow(raio, 2)*altura;

        System.out.printf("\nVolume do silo: %.2f m2", vol);

        scanner.close();
    }
}

