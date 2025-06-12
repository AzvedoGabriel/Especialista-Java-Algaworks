package com.algaworks.agendamento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {

    public static final Scanner scan = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORARIO = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADO_BRASIL = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT)
            .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        // TODO CRIAR RECEBIMENTO DE DATA E HORA (PROVAVELMENTE UM LOOP)
        LocalDate dataEvento = solicitarData();
        LocalTime horaEvento = solicitarHorario();

        LocalDateTime dataHoraEvento = dataEvento.atTime(horaEvento);

        System.out.printf("Evento foi agendado para %s%n", dataHoraEvento.format(FORMATADO_BRASIL));
    }

    private static LocalDate solicitarData() {
       while (true){
           try{
               System.out.println("Data do evento: ");
               String dataTexto = scan.nextLine();

               return LocalDate.parse(dataTexto, FORMATADOR_DATA);
           }catch (DateTimeParseException e){
               System.out.println("Data inserida está inválida. Tente novamente");
           }
       }
    }

    private static LocalTime solicitarHorario(){
        while (true){
            try {
                System.out.println("Horário do evento: ");
                String horarioTexto = scan.nextLine();

                return LocalTime.parse(horarioTexto, FORMATADOR_HORARIO);
            } catch (DateTimeParseException e ){
                System.out.println("Horário inserido está inválido. Tente Novamente");
            }
        }
    }
}
