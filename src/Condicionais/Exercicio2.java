package Condicionais;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        double nota1;
        double nota2;
        double media;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a primeria nota:");
        nota1 = leitura.nextInt();

        System.out.println("Insira a segunda nota: ");
        nota2 = leitura.nextInt();

        media = (nota1 + nota2) / 2;

        if (media < 5){
            System.out.println("O estudante teve uma média de " + media + " e foi reprovado.");
        } else if (media < 7) {
            System.out.println("O estudante teve uma média de " + media + " e está de recuperação");
        } else {
            System.out.println("O estudante teve uma média de " + media + " e foi aprovado");
        }
        leitura.close();
    }
}
