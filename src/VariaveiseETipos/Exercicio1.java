package VariaveiseETipos;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args){

        String nome = "";
        int idade = 0;
        double altura = 0.0;
        boolean estudante = false;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o seu nome: ");
        nome = leitura.nextLine();

        System.out.println("Insira a sua idade: ");
        idade = leitura.nextInt();

        System.out.println("Insira a sua altura: ");
        altura = leitura.nextDouble();
        leitura.nextLine(); //pra limpar o enter do nextDouble

        System.out.println(""" 
                Você é estudante?
                Atenção! Responda apenas com 'sim' ou 'não'""");
        String resposta = leitura.nextLine();

        if (resposta.equalsIgnoreCase("sim")){
            estudante = true;
            }

        String ficha = "Nome: " + nome +
                "\nIdade: " + idade +
                "\nAltura: " + altura +
                "\nÉ estudante: " + estudante;

        System.out.println(ficha);
        leitura.close();
    }
}
