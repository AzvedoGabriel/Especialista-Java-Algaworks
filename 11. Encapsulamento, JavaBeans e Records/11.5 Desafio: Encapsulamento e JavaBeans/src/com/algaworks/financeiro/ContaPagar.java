package com.algaworks.financeiro;

public class ContaPagar {

    private String descricao;

    private double valor;

    private String dataVencimento;

    private boolean pago;

    private Fornecedor fornecedor;

    public void pagar() {
        if (isPago()) {
            throw new IllegalArgumentException("A Conta já está paga!");
        }
        setPago(true);
    }

    public void cancelarPagamento(){
        if (!isPago()) {
            throw new IllegalArgumentException("A conta já está Pendente");
        }
        setPago(false);
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
