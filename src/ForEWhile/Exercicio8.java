package ForEWhile;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int numero;
        int positivos = 0;
        int negativos = 0;
        String entrada;

        Scanner leitura = new Scanner(System.in);

        while (true) {
            System.out.println("Insira um número (ou fim para encerrar: )");
            entrada = leitura.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                System.out.println("Programa encerrado!");
                break;
            }

            numero = Integer.parseInt(entrada);

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                System.out.println(" 0 é um número neutro.");
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números positivos: " + negativos);
        leitura.close();
    }
}