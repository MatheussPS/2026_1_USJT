package br.com.saojudas.at05;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor: ");

        int valor = scanner.nextInt();

        System.out.printf("Para %d reais, serão necessárias: ", valor);

        int n100 = valor/100;
        valor %= 100;

        int n50 = valor / 50;
        valor %= 50;

        int n20 = valor / 20;
        valor %= 20;

        int n10 = valor / 10;
        valor %= 10;

        int n5 = valor / 5;
        valor %= 5;

        int n2 = valor / 2;

        int n1 = valor % 2;

        System.out.printf("\n%d nota(s) de 100 \n%d nota(s) de 50 " +
                "\n%d nota(s) de 20 \n%d nota(s) de 10 " +
                "\n%d nota(s) de 5 \n%d nota(s) de 2\n%d moeda(s) de 1", n100, n50, n20, n10, n5, n2, n1);
        scanner.close();
    }
}

