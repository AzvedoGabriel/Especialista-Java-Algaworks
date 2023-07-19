package com.algaworks.heranca;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.printf("O nome do Funcionário é %s%n" +
                        "seu salário é: R$ %.2f%n" +
                        "referente ao mês de %s%n", nome(), valorSalario(), mesAno());
    }
}
