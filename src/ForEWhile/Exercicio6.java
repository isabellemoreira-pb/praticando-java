package ForEWhile;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        int numeroTentativas = 3;
        int senha = 1234;
        int tentativaSenha;

        Scanner leitura = new Scanner(System.in);

        while(numeroTentativas >= 1){
            System.out.println("Insira a sua senha ");
            tentativaSenha = leitura.nextInt();

            numeroTentativas--;

            if (tentativaSenha == senha){
                System.out.println("Senha correta! Acesso concedido!");
            } else if (tentativaSenha != senha && numeroTentativas == 0){
                System.out.println("Senha incorreta. Conta bloqueada temporariamente.");
            } else {
                System.out.println("Senha incorreta. Você tem " + numeroTentativas + " tentativas restantes.");
            }
        }
    }
}
