package ForEWhile;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        int numero;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira um número: ");
        numero = leitura.nextInt();

        for (int i = 0; i <= numero; i++){
            if (i % 10 == 5){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
