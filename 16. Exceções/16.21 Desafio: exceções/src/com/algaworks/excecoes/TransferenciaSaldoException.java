package com.algaworks.excecoes;

public class TransferenciaSaldoException extends RuntimeException{
    public TransferenciaSaldoException(String message) {
        super(message);
    }

    public TransferenciaSaldoException(String message, Throwable cause) {
        super(message, cause);
    }
}
