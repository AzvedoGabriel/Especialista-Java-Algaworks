package Calendario;

public class Calendario {

    static final String[]  NOME_MESES =
            {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                    "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro","Dezembro" };

    static String obterNomeMes(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12){
            return "Valor posto inexistente (intervalo de 1 a 12)";
        }
        return NOME_MESES[numeroMes - 1];
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(12);

        System.out.println(mes);
    }

}