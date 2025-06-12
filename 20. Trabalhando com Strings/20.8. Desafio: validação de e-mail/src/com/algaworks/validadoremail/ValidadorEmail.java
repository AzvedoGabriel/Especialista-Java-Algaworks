package com.algaworks.validadoremail;

public class ValidadorEmail {

    // email valido
    // nome_do_usuario@dominio.sufixododominio
    // nome_do_usuario não pode ser vazio, aceita = letras e numeros, underscore, hifen, ponto, maiscula também
    // dominio não pode ser vazio, letras e digito são aceitos, underscore n, hifen e o ponto é aceito e apenas letras
    // minusculas.
    // sufixo_do_dominio = so pode ter 2 ou 3 caracteres (ex: .br ou .com), aceita letras apenas minusculas, não aceita
    // nenhum caracter especial.
    public static boolean validar(String email) {
        return false;
    }

    private static boolean validarNomeUsuario(String nomeUsuario){
        return false;
    }

    private static boolean validarNomeDominio(String nomeDominio){
        return false;
    }

    private static boolean validarSufixoDominio (String sufixoDominio){
        return false;
    }

    private static boolean validarCaracterEspecial(){
        return false;
    }

}

