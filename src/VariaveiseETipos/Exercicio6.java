package VariaveiseETipos;

import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args){
        String categoria;
        double preco;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o preço do produto:");
        preco = leitura.nextDouble();

        if(preco <=  50){
            categoria = "Econômico";
        } else if (preco <= 200) {
            categoria = "Intermediário";
        } else {
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: " + categoria);
    }
}
