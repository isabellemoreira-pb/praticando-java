package Condicionais;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        double lado1;
        double lado2;
        double lado3;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o primeiro lado:");
        lado1 = leitura.nextDouble();

        System.out.println("Insira o segundo lado:");
        lado2 = leitura.nextDouble();

        System.out.println("Insira o terceiro lado:");
        lado3 = leitura.nextDouble();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado3 && (lado2 + lado3) > lado1 ){
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
        leitura.close();
    }
}
