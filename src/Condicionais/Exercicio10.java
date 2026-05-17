package Condicionais;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        int codigo = 2023;
        int nivelDePermissao;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o código de acesso: ");
        codigo = leitura.nextInt();

        System.out.println("Insira o nível de permissão: ");
        nivelDePermissao = leitura.nextInt();

        if ((codigo == 2023) && (nivelDePermissao == 1 || nivelDePermissao == 2 || nivelDePermissao == 3)){
            System.out.println("Acesso permitido. Bem-vindo ao sistema! ");
        } else  if ((codigo != 2023) && ((nivelDePermissao != 1) && (nivelDePermissao != 2) && (nivelDePermissao != 3))){
            System.out.println("""
                    Acesso negado. Código e nivel de acesso inválidos.
                    """);
        } else if (codigo != 2023){
            System.out.println("Acesso negado. Código inválido");
        } else if (nivelDePermissao != 1 && nivelDePermissao != 2 && nivelDePermissao != 3){
            System.out.println("Acesso negado. Nivel de acesso inválido");
        }

    }
}
// rever esse e fazer o scanner.close depois !!