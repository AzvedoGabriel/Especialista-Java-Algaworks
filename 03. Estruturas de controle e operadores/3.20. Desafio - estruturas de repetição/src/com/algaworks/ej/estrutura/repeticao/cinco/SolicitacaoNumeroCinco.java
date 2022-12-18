package com.algaworks.ej.estrutura.repeticao.cinco;

import java.util.Scanner;

public class SolicitacaoNumeroCinco {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean saindoDoCodigo = true;

        int somaPares = 0;
        int somaImpares = 0;
        do {
            System.out.println("Digite um número inteiro");
            int numeroInteiro = scan.nextInt();

            if (numeroInteiro % 2 == 0) {
                somaPares += numeroInteiro;
            }

            if (numeroInteiro % 2 == 1) {
                somaImpares += numeroInteiro;
            }

            System.out.println("Deseja sair do programa [ true / false ] ?");
            saindoDoCodigo = scan.nextBoolean();
        } while (!saindoDoCodigo);

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("====================================");
        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
}
