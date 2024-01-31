package com.algaworks.enuns;

public enum StatusNotaFiscal {

    STATUS_NAO_EMITIDA("Não Emetida") {
        @Override
        public boolean podeMudarParaCacenlado(double valor) {
            return true;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return true;
        }
    },

    Status_EMITIDA("EMETIDA") {
        @Override
        public boolean podeMudarParaCacenlado(double valor) {
            return valor < 1_000;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return false;
        }
    },

    Status_CANCELADA("Cancelada") {
        @Override
        public boolean podeMudarParaCacenlado(double valor) {
            return false;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return false;
        }
    };

    private final String descricaoStatus;

    StatusNotaFiscal(String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
    }

    public String getDescricaoStatus() {
        return descricaoStatus;
    }

    public abstract boolean podeMudarParaCacenlado(double valor);
    public abstract boolean podeMudarParaEmitido(double valor);
}
