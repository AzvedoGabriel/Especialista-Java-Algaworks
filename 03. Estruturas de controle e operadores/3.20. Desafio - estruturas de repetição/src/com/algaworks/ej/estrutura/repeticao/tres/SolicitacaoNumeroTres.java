package com.algaworks.ej.estrutura.repeticao.tres;

import java.util.Scanner;

public class SolicitacaoNumeroTres {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int soma = 0;
        while(soma < 100){
            System.out.print("Digite um número (lembrando que terá soma e o resultado será 100): ");
            int numero = scan.nextInt();
            soma+=numero;
        }

        System.out.println("Soma de todos números informados é: " + soma);
    }
}
