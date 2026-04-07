package br.com.saojudas.at05;

import java.util.Scanner;

public class Preco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inisra um valor");
        double preco = scanner.nextDouble();
        
        if(preco > 100){
            System.out.println("Caro");
        } else if (preco > 50) {
            System.out.println("Médio");
        }
        else {
            System.out.println("Barato");
        }

        scanner.close();
    }
}

