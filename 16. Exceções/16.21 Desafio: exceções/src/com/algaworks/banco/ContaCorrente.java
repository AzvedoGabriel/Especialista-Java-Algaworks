package com.algaworks.banco;

import com.algaworks.excecoes.ContaInativaException;
import com.algaworks.excecoes.SaldoInsuficienteException;
import com.algaworks.excecoes.TransferenciaSaldoException;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new SaldoInsuficienteException("Valor de saque deve ser maior que 0");
        }

        if (valor > this.saldo) {
            throw new TransferenciaSaldoException("Conta não tem saldo suficiente");
        }

        if (isInativa()) {
            throw new ContaInativaException("Conta está inativa");
        }

        this.saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new SaldoInsuficienteException("Valor de depósito deve ser maior que 0");
        }

        if (isInativa()) {
            throw new ContaInativaException("Conta está inativa");
        }

        this.saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Conta de destino está inativa");
        }

        sacar(valor);
        contaDestino.depositar(valor);


    }

}
