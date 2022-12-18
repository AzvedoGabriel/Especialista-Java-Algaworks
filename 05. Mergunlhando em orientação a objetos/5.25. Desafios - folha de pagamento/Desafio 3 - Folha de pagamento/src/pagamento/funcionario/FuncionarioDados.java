package pagamento.funcionario;

public class FuncionarioDados {

    String nome;
    int quantidadeFilhos;

    boolean possuiFilhos () {
        return quantidadeFilhos > 0;
    }
}
