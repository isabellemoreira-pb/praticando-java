package ForEWhile;

import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args){
        String nome;
        String tentativa;

        Scanner leitura = new Scanner(System.in);

        while(true){
            System.out.println("Insira o seu nome: ");
            tentativa = leitura.nextLine();

            if (tentativa == null){
                System.out.println("Nome inválido. Digite novamente.");
            } else if(tentativa.length() <= 3) {
                System.out.println("Nome inválido. Digite novamente.");
            } else {
                break;
            }
        }
        nome = tentativa;
        System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
    }
}
