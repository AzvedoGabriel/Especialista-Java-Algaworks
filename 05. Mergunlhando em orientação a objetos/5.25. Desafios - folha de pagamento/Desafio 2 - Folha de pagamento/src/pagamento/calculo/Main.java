package pagamento.calculo;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Cleitinho";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 100;
        contratoTrabalho.valorHoraExtra = 150;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioTotal = folhaPagamento.calcularSalario(200, 25, contratoTrabalho);

        System.out.printf("Salário devido: R$ %.2f%n", salarioTotal);
    }
}
