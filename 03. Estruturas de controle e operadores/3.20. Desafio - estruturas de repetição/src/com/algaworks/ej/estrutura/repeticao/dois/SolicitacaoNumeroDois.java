package com.algaworks.ej.estrutura.repeticao.dois;

import java.util.Scanner;

public class SolicitacaoNumeroDois {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Informe um número inteiro positivo: ");
        int numeroCatch = scan.nextInt();

        boolean numero = true;

        for (int i = 2; i < numeroCatch; i++) {
            if (numeroCatch % 2 == 0) {
                numero = false;
                break;
            }
        }

        if (numero && numeroCatch > 1) {
            System.out.println("Número é primo");
        } else {
            System.out.println("O número não é primo");
        }
    }
}
