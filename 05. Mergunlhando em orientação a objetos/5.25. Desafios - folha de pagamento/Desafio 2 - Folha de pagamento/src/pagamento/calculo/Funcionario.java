package pagamento.calculo;

public class Funcionario {

    String nome;
    int quantidadeFilhos;

    boolean possuiFilhos () {
        return quantidadeFilhos > 0;
    }
}
