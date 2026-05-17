package ForEWhile;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        int numero = 0;
        int fatorial;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira um número: ");
        numero = leitura.nextInt();
        fatorial = numero;

        for (int i = numero-1; i >= 1; i--){
            fatorial *= i;
        }
        System.out.println(fatorial);
        leitura.close();
    }
}