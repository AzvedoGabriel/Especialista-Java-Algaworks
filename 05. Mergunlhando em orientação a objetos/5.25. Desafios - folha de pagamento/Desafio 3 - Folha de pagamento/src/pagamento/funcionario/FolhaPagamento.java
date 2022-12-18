package pagamento.funcionario;

public class FolhaPagamento {

    Holerite calcularSalario(int horaNormal, int horaExtra, ContratoDoTrabalho contratoDoTrabalho) {
        Holerite holerite = new Holerite();
        holerite.funcionarioDados = contratoDoTrabalho.funcionarioDados;
        holerite.valorTotalHoraNormal = horaNormal * contratoDoTrabalho.valorHoraNormal;
        holerite.valorTotalHoraExtra = horaExtra * contratoDoTrabalho.valorHoraExtra;

        double valorTotal = holerite.valorTotalHoraNormal + holerite.valorTotalHoraExtra;

        if(contratoDoTrabalho.possuiAdicionalParaFilhos()){
            holerite.valorAdicionalFilho = valorTotal * 0.10;
        }

        return holerite;
    }

}
