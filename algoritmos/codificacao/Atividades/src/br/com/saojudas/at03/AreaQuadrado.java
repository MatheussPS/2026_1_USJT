package br.com.saojudas.at03;

public class AreaQuadrado {
    public static void main(String[] args) {
        double lado = 18;

        double area = Math.pow(lado, 2);

        System.out.printf("A área do quadrado de %.2fcm de lado é %.2fcm2",lado, area);
    }
}
