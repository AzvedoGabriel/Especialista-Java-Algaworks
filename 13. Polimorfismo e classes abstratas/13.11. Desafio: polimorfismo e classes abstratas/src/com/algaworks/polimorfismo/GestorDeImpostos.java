package com.algaworks.polimorfismo;

public class GestorDeImpostos {
    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa){
        double valorImpostosCalculados = pessoa.calcularImpostos();
        System.out.printf("Impostos devidos de(a) %s: R$%.2f%n", pessoa.getNome(), valorImpostosCalculados);
        valorTotalImpostos += valorImpostosCalculados;
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}