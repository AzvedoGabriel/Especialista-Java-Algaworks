package calculadora.imc;

import java.util.Scanner;

public class CalculoImcHomemMulher {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int pacienteNumero;

        System.out.print("Informe o peso do paciente: ");
        double pesoPaciente = scan.nextDouble();

        System.out.print("Informe a altura do paciente: ");
        double altura = scan.nextDouble();

        System.out.println("Informe se o paciente é [ 1 - Masculino / 2 - Feminino]");
        pacienteNumero = scan.nextInt();

        double calculoImc = pesoPaciente / (altura * altura);

        if ((pacienteNumero == 1 && calculoImc < 20.7) || (pacienteNumero == 2 && calculoImc < 19.1)) {

            System.out.printf("Abaixo do peso ideal: %.2f%n", calculoImc);

        } else if ((pacienteNumero == 1 && calculoImc < 26.4) || (pacienteNumero == 2 && calculoImc < 25.8)) {
            System.out.printf("No peso ideal: %.2f%n", calculoImc);

        } else if ((pacienteNumero == 1 && calculoImc < 27.8) || (pacienteNumero == 2 && calculoImc < 27.3)) {
            System.out.printf("Um pouco acima do peso: %.2f%n", calculoImc);

        } else if ((pacienteNumero == 1 && calculoImc < 31.1) || (pacienteNumero == 2 && calculoImc < 32.3)) {
            System.out.printf("Acima do peso ideal: %.2f%n", calculoImc);

        } else {
            System.out.printf("O Paciente está obeso: %.2f%n", calculoImc);
        }
    }
}
