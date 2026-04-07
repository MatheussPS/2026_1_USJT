package br.com.saojudas.at05;

import java.util.Scanner;

public class ClassificacaoNadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String classiifcacao;

        System.out.println("Insira a idade: ");
        int idade = scanner.nextInt();

        if(idade > 5 && idade < 10){
            classiifcacao = "Infantil";
        } else if (idade > 11 && idade < 17) {
            classiifcacao = "Juvenil";
        }
        else {
            classiifcacao = "Sênior";
        }

        System.out.println(classiifcacao);

        scanner.close();
    }
}
