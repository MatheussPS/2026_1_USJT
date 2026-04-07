package br.com.saojudas.at05;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma letra: ");
        String letra = scanner.next();

        String resposta = "Vogal";

        switch (letra.toLowerCase()){
            case "a", "i", "e", "o", "u": break;
            default: resposta = "Consoante";
        }

        System.out.printf("%s", resposta);

        scanner.close();
    }
}
