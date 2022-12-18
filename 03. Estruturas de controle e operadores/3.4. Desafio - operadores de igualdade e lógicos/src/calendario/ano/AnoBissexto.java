package calendario.ano;

import java.util.Scanner;

public class AnoBissexto {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int anoAtual;
        System.out.print("Informe o ano: ");
        anoAtual = scan.nextInt();

        boolean anoBissexto = (anoAtual % 400 == 0) || (anoAtual % 4 == 0) && (anoAtual % 100 !=0);

        System.out.printf("É um ano bissexto? %b%n", anoBissexto);
    }
}
