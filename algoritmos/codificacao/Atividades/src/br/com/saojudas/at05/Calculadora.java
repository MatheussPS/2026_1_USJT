package br.com.saojudas.at05;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double resultado = 0;

        System.out.print("Insira o 1º número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Insira o 2º número: ");
        double num2 = scanner.nextDouble();

        System.out.print("\nSoma (+)\nSubtração (-)\nDivisão (/)\nMultiplicação (*)\n\nInsira a opção: ");
        String op = scanner.next();

        boolean erro = false;

        switch (op){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                if (num2 != 0){
                    resultado = num1 / num2;
                }
                else {
                    System.out.println("Erro: Divisão por 0");
                    erro = true;
                }
                break;
            case "*":
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Erro: operador inválido");
                erro = true;
                break;
        }

        if(!erro){
            System.out.printf("O resultado e %.2f %s %.2f é igual a: %.2f", num1, op, num2, resultado);
        }

        scanner.close();
    }
}
