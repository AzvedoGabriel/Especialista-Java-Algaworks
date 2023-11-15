package com.algaworks.calculo.idade.media.pessoas;

public class CalculadoraIdadeMedia {
    public static void main(String[] args) {
        int idade1 = 30;
        int idade2 = 40;
        int idade3 = 60;

        float idadeMedia = (idade1 + idade2 + idade3) / 3f;
        double idadeMediaDois = (double) (idade1 + idade2 + idade3) /3;
        System.out.println("Idade média: " + idadeMedia);
        System.out.println("Idade média com double: " + idadeMediaDois);
    }

}

