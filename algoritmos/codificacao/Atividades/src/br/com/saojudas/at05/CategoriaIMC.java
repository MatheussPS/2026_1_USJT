package br.com.saojudas.at05;

import java.util.Scanner;

public class CategoriaIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String categoria;

        System.out.print("Insira sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Insira seu peso: ");
        double peso = scanner.nextDouble();

        double imc = peso /Math.pow(altura, 2);

        if(imc < 18.5) {
            categoria = "Baixo";
        }
        else if (imc >= 18.5 && imc < 25) {
            categoria = "Médio";
        }
        else if (imc >= 25 && imc < 30) {
            categoria = "Pouco Elevado";
        }
        else if (imc >= 30 && imc < 35) {
            categoria = "Elevado";
        }
        else if (imc >= 35 && imc < 30) {
            categoria = "Muito Elevado";
        }
        else {
            categoria = "Muitíssimo Elevado";
        }

        System.out.printf("Seu imc %.2f", imc);
        System.out.printf("Categoria: %s", categoria);

        scanner.close();
    }
}
