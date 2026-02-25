package br.com.saojudas.at01;
import java.util.Scanner;

public class LeiOhm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a resistencia em Ohms: ");
        double resistencia = scanner.nextDouble();

        System.out.print("Insira a corrente em Amperes: ");
        double corrente = scanner.nextDouble();

        double voltagem = resistencia*corrente;

        System.out.printf("\nA voltagem total é de %.2f Volts", voltagem);
        scanner.close();
    }
}
