package pagamento.calculo;

public class FolhaPagamento {

    double calcularSalario(int horaNormal, int horaExtra, ContratoTrabalho contratoTrabalho) {

        double valorHorasNormais = horaNormal * contratoTrabalho.valorHoraNormal;
        double valorHorasExtras = horaExtra * contratoTrabalho.valorHoraExtra;

        double valorTotal = valorHorasNormais * valorHorasExtras;

        if(contratoTrabalho.possuiAdicionalParaFilhos()){
            valorTotal *= 1.10;
        }

        return valorTotal;
    }

}
