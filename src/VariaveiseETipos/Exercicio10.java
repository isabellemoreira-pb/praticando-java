package VariaveiseETipos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        double consumoMedio;
        double capacidadeTotalTanque;
        double combustivelDisponivel;
        double distancia;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o consumo médio do veículo(km/l):");
        consumoMedio = leitura.nextDouble();

        System.out.println("Insira a capacidade total do tanque(l):");
        capacidadeTotalTanque = leitura.nextDouble();

        System.out.println("Insira o combustível disponível(l):");
        combustivelDisponivel = leitura.nextDouble();

        System.out.println("Insira a distância da viagem(km):");
        distancia = leitura.nextDouble();

        double autonomiaMaxima =  consumoMedio * capacidadeTotalTanque;
        double autonomiaAtual = consumoMedio * combustivelDisponivel;

        System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + "km");
        System.out.println("Autonomia atual: " + autonomiaAtual + "km");

        if (autonomiaAtual >= distancia){
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Você precisará abastecer antes de continuar a viagem");
        }

    }
}
