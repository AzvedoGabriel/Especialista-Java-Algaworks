package br.com.algamilhas.dados;

import java.util.Objects;

public class Participante {

    private String nome;
    private int saldoDePontos;

    public Participante(String nome) {
        this(nome,0);
    }

    private Participante(String nome, int saldoDePontosInicial) {
        Objects.requireNonNull(nome , "Nome é obrigatorio");

        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("Saldo de pontos insuficiente (valor está abaixo de zero)");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;

    }

    public void creditarPontos(int pontos) {
        if (pontos < 0) {
            throw new IllegalArgumentException("Não é possivel creditar pontos negativos");
        }
        this.saldoDePontos+=pontos;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldoDePontos() {
        return saldoDePontos;
    }

    public void setSaldoDePontos(int saldoDePontos) {
        this.saldoDePontos = saldoDePontos;
    }
}
