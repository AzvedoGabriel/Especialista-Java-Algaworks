package com.algaworks.calculo.parcelas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Data da primeira parcela: ");
        String dataParcelaTexto = scan.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = scan.nextInt();

        LocalDate dataParcela = LocalDate.parse(dataParcelaTexto, FORMATADOR_DATA);
        CalculandoParcelas calculandoParcelas = new CalculandoParcelas();
        List<LocalDate> dataParcelas = calculandoParcelas.calcular(dataParcela, quantidadeParcelas);

        imprimirParcelas(dataParcelas);
    }

    private static void imprimirParcelas(List<LocalDate> datasParcelas) {
        for (int i = 0; i < datasParcelas.size(); i++) {
            System.out.printf("Parcela -%d - %s%n", i + 1, datasParcelas.get(i).format(FORMATADOR_DATA));
        }
    }
}
