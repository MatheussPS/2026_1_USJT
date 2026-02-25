package br.com.saojudas.at01;
import java.util.Scanner;

public class DosagemConcreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o volume total do concreto: ");
        double vConcreto = scanner.nextDouble();

        System.out.print("Insira o traco(consumo): ");
        double traco = scanner.nextDouble();

        double qtdSacos = (vConcreto*traco)/50;

        System.out.printf("\nQuantidade total de sacos de 50kg: %.2f", qtdSacos);

        scanner.close();
    }
}
