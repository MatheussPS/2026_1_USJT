package br.com.saojudas.at03;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Insira a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Insira a terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = (n1+n2+n3)/3;

        System.out.printf("A média das notas é %.2f", media);

        scanner.close();
    }
}
