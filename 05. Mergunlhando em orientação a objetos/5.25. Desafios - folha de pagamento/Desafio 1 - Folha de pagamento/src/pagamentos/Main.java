package pagamentos;

public class Main {
    public static void main(String[] args) {
        FolhaPagamento pagamento = new FolhaPagamento();

        double salarioFinal = pagamento.calcularSalario(120, 20
        , 50.9, 60.9);

        System.out.printf("O salário do funcionario é: %.2f%n", salarioFinal);
    }
}
