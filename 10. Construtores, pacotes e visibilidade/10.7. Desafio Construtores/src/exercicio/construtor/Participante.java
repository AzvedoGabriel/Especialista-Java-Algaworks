package exercicio.construtor;

import java.util.Objects;

public class Participante {

    String nome;
    int saldoDePontos;

    Participante(String nome) {
        this(nome,0);
    }

    Participante(String nome, int saldoDePontosInicial) {
        Objects.requireNonNull(nome , "Nome é obrigatorio");

        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("Saldo de pontos insuficiente (valor está abaixo de zero)");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;

    }
}
