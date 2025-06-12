package com.algaworks.paciente;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class IdadePaciente {

    public static final Scanner scan = new Scanner(System.in);

    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        LocalDate dataNascimento = solicitarData();
        Period tempoDeVida = dataNascimento.until(LocalDate.now());

        System.out.printf("Paciente tem %s de vida%n", formatarPeriodo(tempoDeVida));
    }

    private static String formatarPeriodo(Period tempoDeVida) {
        return String.format("%d ano%s, %d %s e %d dia%s",
                tempoDeVida.getYears(), tempoDeVida.getYears() > 1 ? "s" : "",
                tempoDeVida.getMonths(), tempoDeVida.getMonths() > 1 ? "meses" : "mês",
                tempoDeVida.getDays(), tempoDeVida.getDays() > 1 ? "s" : "");
    }

    private static LocalDate solicitarData() {
        while (true){
            try{
                System.out.print("Data de Nascimento: ");
                String dataNascimentoTexto = scan.nextLine();

                return LocalDate.parse(dataNascimentoTexto, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("A data inserida está inválida. Tente Novamente (Formato aceito dd/MM/yyyy)");
            }
        }
    }
}
