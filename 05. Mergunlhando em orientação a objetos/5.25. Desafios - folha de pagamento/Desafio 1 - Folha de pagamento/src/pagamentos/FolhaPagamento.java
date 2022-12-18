package pagamentos;

public class FolhaPagamento {

    double calcularSalario(double quantidadeHoraTrabalhada, double quantidadeHoraExtraTrabalhada,
                           double horaNormal, double horaExtra){

        double salarioTotal = (horaNormal * quantidadeHoraTrabalhada) + (horaExtra * quantidadeHoraExtraTrabalhada);

        return salarioTotal;

    }
}
