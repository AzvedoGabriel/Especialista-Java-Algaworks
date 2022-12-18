package prestadores.de.servico;

import java.util.Locale;
import java.util.Scanner;

public class PrestadorServicos {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double valorHora, valorDesconto;
        int horaTrabalhada;
        String nome = "";

        System.out.print("Por gentileza informe o nome: ");
        nome = scan.nextLine();

        System.out.print("Quantidade de horas trabalhadas da pessoa: ");
        horaTrabalhada = scan.nextInt();

        System.out.print("Valor por hora da pessoa: ");
        valorHora = scan.nextDouble();

        System.out.print("Valor dos descontos: ");
        valorDesconto = scan.nextDouble();

        double valorCheioTrabalhado = horaTrabalhada * valorHora;

        double valorCheioDevido = valorCheioTrabalhado - valorDesconto;

        System.out.printf("%nFolha de pagamento: %s%n", nome);
        System.out.printf("%d horas x R$%.2f = R$%.2f%n", horaTrabalhada, valorHora, valorCheioTrabalhado);
        System.out.printf("Descontos: R$%.2f%n", valorDesconto);
        System.out.printf("Total devido: R$%.2f%n", valorCheioDevido);
    }
}
