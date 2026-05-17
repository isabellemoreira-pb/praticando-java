package VariaveiseETipos;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        int idade;
        String mensagem;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a sua idade:");
        idade = leitura.nextInt();

        if (idade >=18){
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);
        leitura.close();
    }
}
