package br.com.saojudas.at02;

import java.util.Scanner;

public class ConsumoEnergetico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a potencia(W): ");
        double potencia = scanner.nextDouble();

        System.out.print("Insira o tempo de uso diário(h): ");
        double tempo = scanner.nextDouble();

        System.out.print("Insira o preço do Kwh: ");
        double preco = scanner.nextDouble();

        double dias = 30;
        double custo = (potencia * tempo * preco * dias)/1000;

        System.out.printf("\nCusto mensal em Kwh: %.2f reais", custo);

        scanner.close();
    }
}
