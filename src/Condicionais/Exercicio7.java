package Condicionais;

import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args){
        double emprestimo;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o valor do empréstimo: ");
        emprestimo = leitura.nextDouble();

        if (emprestimo >= 1000 && emprestimo <= 5000){
            System.out.println("O valor " + emprestimo + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + emprestimo + " não está dentro do intervalo permitido para empréstimo.");
        }
        leitura.close();
    }
}
