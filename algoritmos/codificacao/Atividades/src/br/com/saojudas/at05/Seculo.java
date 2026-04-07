package br.com.saojudas.at05;

import java.util.Scanner;

public class Seculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu ano de nascimento: ");
        int anoNasc = scanner.nextInt();

        int sec = (anoNasc + 99) /100;

        switch (sec){
            case 21:
                System.out.println("XXI");
                break;
            case 20:
                System.out.println("XX");
                break;
            default:
                System.out.printf("Outro: %d", sec);
        }

        scanner.close();
    }
}
