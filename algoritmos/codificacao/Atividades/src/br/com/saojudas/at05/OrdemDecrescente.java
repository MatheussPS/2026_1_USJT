package br.com.saojudas.at05;

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double menor, meio, maior;

        System.out.print("Insira o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Insira o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Insira o valor de c: ");
        double c = scanner.nextDouble();

        if (a <= b && a <= c)
            menor = a;
        else {
            if (b <= a && b <= c)
                menor = b;
            else
                menor = c;
        }

        if (a >= b && a >= c)
            maior = a;
        else {
            if (b >= a && b >= c)
                maior = b;
            else
                maior = c;
        }

        meio = a + b + c - menor - maior;
        System.out.printf("\n%.2f %.2f %.2f", maior, meio, menor);

        scanner.close();
    }
}
