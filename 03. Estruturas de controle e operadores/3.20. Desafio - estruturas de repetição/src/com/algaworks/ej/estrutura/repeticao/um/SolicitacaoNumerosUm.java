package com.algaworks.ej.estrutura.repeticao.um;

import java.util.Scanner;

public class SolicitacaoNumerosUm {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int numeroSalvoPar = 0;
        System.out.println(" === Por gentileza digite números abaixo  ===\n");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite os números: ");
            int numeroSalvo = scan.nextInt();

            if (numeroSalvo % 2 == 0) {
                numeroSalvoPar += numeroSalvo;
            } else {
                i--;
            }

        }

        System.out.println("Saída da soma dos números: " + numeroSalvoPar);
    }
}
