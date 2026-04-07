package br.com.saojudas.at05;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta = "Quadrante ";

        System.out.print("Insira x: ");
        double x = scanner.nextDouble();

        System.out.print("Insira y: ");
        double y = scanner.nextDouble();

        if(x > 0 && y > 0){
            resposta+="I";
        } else if (x > 0 && y < 0) {
            resposta+="IV";
        } else if (x < 0 && y > 0) {
            resposta+="II";
        } else if (x < 0 && y < 0) {
            resposta+="III";
        }
        else {
            resposta = "Eixo";
        }

        System.out.printf("%s", resposta);
    }
}
