package Condicionais;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        int primeiroNumero;
        int segundoNumero;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        primeiroNumero = leitura.nextInt();

        System.out.println("Insira o segundo número: ");
        segundoNumero = leitura.nextInt();

        if (primeiroNumero == segundoNumero){
            System.out.println("Os dois números são iguais.");
        } else if (primeiroNumero > segundoNumero){
            System.out.println(String.format("O número %d é maior do que o %d", primeiroNumero, segundoNumero));
        } else {
            System.out.println(String.format("O número %d é maior do que o %d", segundoNumero, primeiroNumero));
        }
        leitura.close();
    }
}
