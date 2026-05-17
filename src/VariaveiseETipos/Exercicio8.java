package VariaveiseETipos;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        double taxaDeCambio = 5.25;
        double valorReais;
        double valorDolar;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o valor em reais a ser convertido: ");
        valorReais = leitura.nextDouble();

        valorDolar =  valorReais / taxaDeCambio;

        System.out.println("O valor em doláres é: US$" + valorDolar);
        leitura.close();
    }
}
