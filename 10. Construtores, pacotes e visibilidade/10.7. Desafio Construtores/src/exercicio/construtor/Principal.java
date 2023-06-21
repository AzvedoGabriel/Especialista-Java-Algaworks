package exercicio.construtor;

public class Principal {
    public static void main(String[] args) {
        Participante participante = new Participante("Clara");

        Participante participanteSaldo = new Participante("Lucas", 500);

        System.out.printf("Participante %s tem um total de pontos " +
                "de %d%n", participante.nome, participante.saldoDePontos);

        System.out.printf("Participante %s tem um total de pontos " +
                "de %d%n", participanteSaldo.nome, participanteSaldo.saldoDePontos);
    }
}
