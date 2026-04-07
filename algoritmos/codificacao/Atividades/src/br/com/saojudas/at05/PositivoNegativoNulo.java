package br.com.saojudas.at05;

import java.util.Scanner;

public class PositivoNegativoNulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double num = scanner.nextDouble();

        if(num > 0){
            System.out.println("Positivo");
        }
        else if(num < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Nulo");
        }

        scanner.close();
    }
}
