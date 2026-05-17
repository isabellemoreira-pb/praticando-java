package ForEWhile;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        int numeroDeDegraus;
        int i = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        numeroDeDegraus = leitura.nextInt();

        while(i != numeroDeDegraus){
            i++;
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("Você chegou ao topo!");
        leitura.close();
    }
}

/* for (i = 0; i!=numeroDeDegraus; i++){} */

/* for each
for (String nomeVendedor : vendedores){
sout("Nome: " + nomeVendedor);
vendedores é uma lista de nomes. */