package com.algaworks.ej.estrutura.repeticao.quatro;

import java.util.Scanner;

public class SolicitacaoNumeroQuatro {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o número que deseja inverter: ");
        int numero = scan.nextInt();

        int numeroInvertido = 0;

        while (numero > 0) {
            numeroInvertido *= 10;
            numeroInvertido += (numero % 10);
            numero /= 10;
        }

        System.out.println("O número invertido é: " + numeroInvertido);
    }
}
