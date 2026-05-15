package VariaveiseETipos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args){
        double valorProduto;
        int valorProdutoInteiro;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o valor do produto: ");
        valorProduto = leitura.nextDouble();

        valorProdutoInteiro =  (int) valorProduto;

        System.out.println("O valor inteiro do produto é: " + valorProdutoInteiro);
    }
}
