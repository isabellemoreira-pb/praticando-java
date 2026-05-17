package Condicionais;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        int idade;
        double peso;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a sua idade: ");
        idade = leitura.nextInt();

        System.out.println("Insira o seu peso: ");
        peso = leitura.nextDouble();

        if (peso >50 && (idade >= 18 && idade <= 65)){
            System.out.println("O doador é compatível");
        } else {
            System.out.println("O doador não é compatível");
            System.out.println("Motivo: o doador deve ter mais de 50kg e ter entre 18 e 65 anos.");
        }
        leitura.close();
    }
}
