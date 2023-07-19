package com.algaworks.heranca;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jão", 15);
        Holerite holerite = funcionario.gerarHolerite(250, "nov/2023");
        holerite.imprimir();

        System.out.println();
        Programador programador = new Programador("Creitinho", 25);
        programador.setValorBonus(500);
        Holerite holeritePG = programador.gerarHolerite(300, "fev/2023");
        holeritePG.imprimir();
    }
}
