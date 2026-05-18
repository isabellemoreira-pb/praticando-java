package ForEWhile;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        ArrayList<String> listaDeConvidados = new ArrayList<>();
        String nome;

        Scanner leitura = new Scanner(System.in);

        while(true){
            System.out.println("Insira o nome do convidado (ou \"ver\" para visitar a lista): ");
            nome = leitura.nextLine().trim();

            if(nome.equalsIgnoreCase("sair")){
                System.out.println("Programa finalizado.");
                break;
            }

            if (nome.equalsIgnoreCase("ver")){
                System.out.println("Lista atualizada de convidados: " + listaDeConvidados);
                continue;
            }

            boolean existe = false;

            for (String convidados : listaDeConvidados){
                if (convidados.toLowerCase().equalsIgnoreCase(nome)){
                    existe = true;
                    break;
                }
            }

            if(existe){
                System.out.println("O nome " + nome + "já está na lista.");
            } else {
                listaDeConvidados.add(nome);
                System.out.println(nome + " foi adicionado à lista de convidados.");
            }

        }
    }
}
