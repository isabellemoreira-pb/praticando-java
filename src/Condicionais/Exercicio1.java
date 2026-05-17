package Condicionais;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int numero;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira um número: ");
        numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        leitura.close();
    }
}