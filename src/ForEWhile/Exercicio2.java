package ForEWhile;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] valores = new int[3];
        int soma = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        valores[0] = leitura.nextInt();

        System.out.print("Insira o segundo valor: ");
        valores[1] = leitura.nextInt();

        System.out.print("Insira o terceiro valor: ");
        valores[2] = leitura.nextInt();

        for (int valor : valores) {
            soma += valor;
        }

        System.out.println("A soma das receitas é: " + soma);
        leitura.close();
        }
    }