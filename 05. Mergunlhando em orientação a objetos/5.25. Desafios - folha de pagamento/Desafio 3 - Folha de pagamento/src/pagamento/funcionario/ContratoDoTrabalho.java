package pagamento.funcionario;

public class ContratoDoTrabalho {
    FuncionarioDados funcionarioDados;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean possuiAdicionalParaFilhos() {
        return funcionarioDados.possuiFilhos();
    }

}