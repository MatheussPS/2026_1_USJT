import java.util.Scanner;

public class VotarDirigir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "";

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 16){
            resposta = "Tem idade para votar";
            if(idade >= 18){
                resposta+= " Tem idade para dirigir";
            }
        }
        else{
            resposta = "Não tem idade pra votar, nem para dirigir";
        }

        System.out.println(resposta);

        scanner.close();
    }
}
