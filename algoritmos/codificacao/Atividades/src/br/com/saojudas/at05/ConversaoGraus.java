package br.com.saojudas.at05;

import java.util.Scanner;

public class ConversaoGraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double conversao = 0.0;
        boolean valido = true;

        System.out.print("C - Graus Celsius\nF-Farenheit\n\nInsira a opção: ");
        String op = scanner.next();

        System.out.print("\nInsira o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        switch (op.toLowerCase()){
            case "c": conversao = ( valor * 1.8) + 32;
                break;
            case "f": conversao = (valor - 32) / 1.8;
                break;
            default:
                valido = false;
        }

        if (valido){
            System.out.printf("Valor original %.2f: ", valor);
            System.out.printf("Convertido: %.2f º%s", conversao, op.toUpperCase());
        }
        else{
            System.out.println("Opção inválida");
        }
    }
}
