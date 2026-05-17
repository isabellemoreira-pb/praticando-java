package Condicionais;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        String diaDaSemana;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira um dia da semana: ");
        diaDaSemana = leitura.nextLine().toLowerCase().trim();

        if (diaDaSemana.equals("segunda") || diaDaSemana.equals("terça") || diaDaSemana.equals("quarta")
        || diaDaSemana.equals("quinta") || diaDaSemana.equals("sexta")){
            System.out.println(diaDaSemana + " é um dia útil");
        } else if (diaDaSemana.equals("sábado") || diaDaSemana.equals("domingo")) {
            System.out.println(diaDaSemana + " não é um dia útil");
        } else {
            System.out.println("Entrada inválida");
        }
        leitura.close();
    }
}
