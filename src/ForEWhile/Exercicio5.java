package ForEWhile;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        String[] numeros;
        int maior;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira os numeros da lista separados por espaço");
        numeros = leitura.nextLine().split(" "); //?

        maior = Integer.MIN_VALUE; //?

        for (String numStr : numeros){
            int num = Integer.parseInt(numStr);
            if (num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        leitura.close();
    }
}
