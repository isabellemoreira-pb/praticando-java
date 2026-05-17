package Condicionais;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //valor da compra, valor do desconto, novo valor
        double valorDaCompra;
        double desconto = 0.1;
        double novoValor;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        valorDaCompra = leitura.nextDouble();



        if (valorDaCompra >= 100){
            novoValor = valorDaCompra -  (valorDaCompra * desconto);
            System.out.println(String.format("""
                    Desconto de 10%% aplicado.
                    Novo valor: R$ %.2f
                    """, novoValor));
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + valorDaCompra);
        }
        leitura.close();
    }
}
// Pra usar "%" no string.format é preciso usar %%
// %.2f pra mostrar apenas 2 casas decimais.
// checar porque o .format é redundante