package com.algaworks.agencia;

import com.algaworks.agencia.excecao.PacoteViagemExistenteException;
import com.algaworks.agencia.excecao.PacoteViagemRemoveException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CadastroPacoteViagem {

    // TODO declarar lista de pacotes de viagem aqui
    private final List<PacoteViagem> pacoteViagens = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        // TODO adicionar pacote na lista, validando antes se
        //  já existe usando contains (lançar exceção)
        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);

        if (pacoteViagens.contains(pacoteViagem)) {
            throw new PacoteViagemExistenteException("Pacote de viagem já foi adicionado");
        }
        pacoteViagens.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        return pacoteViagens;
    }

    public void ordenar() {
        Collections.sort(pacoteViagens);
    }

    public void ordenarPorPrecoDecrescente() {
        pacoteViagens.sort(new PrecoPacoteViagemComparator().reversed());
    }

    public void removerPorDescricao(String descricao) {
        // TODO iterar nos pacotes com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum pacote foi removido
        boolean remove = false;
        Iterator<PacoteViagem> pacoteViagemIterator = pacoteViagens.iterator();
        while (pacoteViagemIterator.hasNext()) {
            PacoteViagem pacoteViagem = pacoteViagemIterator.next();
            if (pacoteViagem.getDescricao().equals(descricao)){
                pacoteViagemIterator.remove();
                remove = true;
            }
        }

        if (!remove) {
            throw new PacoteViagemRemoveException("Pacote já foi removido ou já não foi encontrado.");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        // TODO iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)
        for (PacoteViagem pacoteViagem: pacoteViagens){
            if (pacoteViagem.getDescricao().equals(descricao)){
                return pacoteViagem;
            }
        }
        throw new IllegalArgumentException("Pacote de viagem não encontrado, digitou corretamente?");
    }

}