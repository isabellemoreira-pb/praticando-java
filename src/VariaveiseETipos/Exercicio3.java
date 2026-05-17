package VariaveiseETipos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        double nota1;
        double nota2;
        double nota3;
        double media;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a nota 1: ");
        nota1 = leitura.nextDouble();

        System.out.println("Insira a nota 2: ");
        nota2 = leitura.nextDouble();

        System.out.println("Insira a nota 3: ");
        nota3 = leitura.nextDouble();

        media = (nota1 + nota2 +nota3) / 3;

        System.out.println("A média das notas é: " + media);
        leitura.close();
    }
}
