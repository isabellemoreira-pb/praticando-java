package Condicionais;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        String senha = "Senha123";
        String tentativa;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a senha: ");
        tentativa = leitura.nextLine();

        if (tentativa.equals("Senha123")){
            System.out.println("Acesso permitido!");
        } else{
        System.out.println("Acesso negado!");
        }
    }
}
