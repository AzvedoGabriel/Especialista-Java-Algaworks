package pagamento.funcionario;

public class Main {
    public static void main(String[] args) {
        FuncionarioDados funcionario = new FuncionarioDados();
        funcionario.nome = "Cleitinho";
        funcionario.quantidadeFilhos = 2;

        ContratoDoTrabalho contratoDoTrabalho = new ContratoDoTrabalho();
        contratoDoTrabalho.funcionarioDados = funcionario;
        contratoDoTrabalho.valorHoraNormal = 100;
        contratoDoTrabalho.valorHoraExtra = 150;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(200, 35, contratoDoTrabalho);

        holerite.impressaoDetalhesHolerite();
    }
}
