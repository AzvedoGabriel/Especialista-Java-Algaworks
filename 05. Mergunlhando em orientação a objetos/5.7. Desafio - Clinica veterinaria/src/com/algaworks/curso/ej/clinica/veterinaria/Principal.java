package com.algaworks.curso.ej.clinica.veterinaria;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorroUm = new Cachorro();
        cachorroUm.nome = "Lola";
        cachorroUm.idade = 3;
        cachorroUm.sexo = "Feminino";
        cachorroUm.raça = "Poodle";

        Cachorro cachorroDois = new Cachorro();
        cachorroDois.nome = "Bolt";
        cachorroDois.idade = 2;
        cachorroDois.sexo = "Masculino";
        cachorroDois.raça = "Mastiff terrier";

        System.out.println("=== Cães cadastrados ===");
        System.out.printf("Nome do primeiro cão: %s%n", cachorroUm.nome);
        System.out.printf("Idade: %d%n", cachorroUm.idade);
        System.out.printf("Sexo: %s%n", cachorroUm.sexo);
        System.out.printf("Raça do cão: %s%n", cachorroUm.raça);

        System.out.println("=======================================");

        System.out.printf("Nome do segundo cão: %s%n", cachorroDois.nome);
        System.out.printf("Idade: %d%n", cachorroDois.idade);
        System.out.printf("Sexo: %s%n", cachorroDois.sexo);
        System.out.printf("Raça do cão: %s%n", cachorroDois.raça);
    }
}
