package VariaveiseETipos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        int celsius;
        double fahrenheit;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira uma temperatura em graus celsius: ");
        celsius = leitura.nextInt();

        fahrenheit = ((double)celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: "
                + fahrenheit);
        leitura.close();
    }
}
