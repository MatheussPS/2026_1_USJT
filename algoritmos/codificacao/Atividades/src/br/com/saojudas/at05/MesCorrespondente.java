package br.com.saojudas.at05;

import java.util.Scanner;

public class MesCorrespondente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corresponde;

        System.out.print("Insira um mês por meios numéricos: ");
        int mes = scanner.nextInt();

        switch (mes){
            case 1: corresponde = "Janeiro";
                break;
            case 2: corresponde = "Fevereiro";
                break;
            case 3: corresponde = "Março";
                break;
            case 4: corresponde = "Abril";
                break;
            case 5: corresponde = "Maio";
                break;
            case 6: corresponde = "Junho";
                break;
            case 7: corresponde = "Julho";
                break;
            case 8: corresponde = "Agosto";
                break;
            case 9: corresponde = "Setembro";
                break;
            case 10: corresponde = "Outubro";
                break;
            case 11: corresponde = "Novembro";
                break;
            case 12: corresponde = "Dezembro";
                break;
            default:
                corresponde = "Entrada inválida";
        }

        System.out.printf("%s", corresponde);
        scanner.close();
    }
}
