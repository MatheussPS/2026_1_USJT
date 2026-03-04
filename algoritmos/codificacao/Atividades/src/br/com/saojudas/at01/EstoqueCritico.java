package br.com.saojudas.at01;

import java.util.Scanner;

public class EstoqueCritico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade atual: ");
        int qtdAtual = scanner.nextInt();

        System.out.print("Insira a quantidade minima: ");
        int qtdMin = scanner.nextInt();

        String mensagem = (qtdAtual < qtdMin)? "Efetuar Compra": "Estoque OK";

        System.out.printf("\n%s",mensagem);
        scanner.close();
    }
}
