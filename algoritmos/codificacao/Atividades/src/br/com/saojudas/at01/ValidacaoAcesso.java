package br.com.saojudas.at01;

import java.util.Objects;
import java.util.Scanner;

public class ValidacaoAcesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o código secreto: ");
        String codigo = scanner.next();

        String mensagem = (Objects.equals(codigo, "1234"))? "Acesso Permitido"
                : "Acesso Negado";

        System.out.printf("\n%s",mensagem);
        scanner.close();
    }

}
