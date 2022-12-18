package pagamento.funcionario;

public class Holerite {

    FuncionarioDados funcionarioDados;
    double valorTotalHoraNormal;
    double valorTotalHoraExtra;
    double valorAdicionalFilho;

    double calcularValorTotal () {
        return valorTotalHoraNormal + valorTotalHoraExtra + valorAdicionalFilho;
    }

    void impressaoDetalhesHolerite () {
        System.out.print("== Informações Holorite ==\n");
        System.out.printf("Nome: %s%n", funcionarioDados.nome);
        System.out.printf("Valor das horas trabalhadas do funcionario em expediente: %.2f%n", valorTotalHoraNormal);
        System.out.printf("Valor das horas extras do funcionario em expediente: R$ %.2f%n", valorTotalHoraExtra);
        System.out.printf("Valor adicional para filhos: R$ %.2f%n", valorAdicionalFilho);
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
    }
}
