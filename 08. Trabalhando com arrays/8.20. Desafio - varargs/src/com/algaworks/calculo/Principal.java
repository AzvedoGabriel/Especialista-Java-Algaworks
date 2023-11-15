package com.algaworks.calculo;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        double media = calcularMediaNumeros(67.5, 35.2, 10.5, 13.9, 78);
        System.out.printf("Média: %.2f%n", media);
    }

    public static double calcularMediaNumeros(double numeroA, double numeroB, double... numeroTotais) {
        double[] todosNumeros = Arrays.copyOf(numeroTotais, numeroTotais.length + 2);
        todosNumeros[todosNumeros.length - 2] = numeroA;
        todosNumeros[todosNumeros.length - 1] = numeroB;

        double soma = 0;

        for (double numero : todosNumeros) {
            soma += numero;
        }

        return soma / todosNumeros.length;
    }
}
