public class Principal {
    public static void main(String[] args) {
        System.out.println("---Invocando os métodos---");

        // Aqui são todos Metodos para descobrir o maior Inteiro
        int maiorDois = NumeroUtil.maiorInteiro(5, 6);
        int maiorTres = NumeroUtil.maiorInteiro(8,9,4);

        // Aqui são todos metodos para descobri o maior decimal
        double maiorDoisDecimal = NumeroUtil.maiorInteiroDecimal(7,3);
        double maiorTresDecimal = NumeroUtil.maiorInteiroDecimal(40,35,10);

        System.out.printf("Maior número dado 2 inteiro: %d%n", maiorDois);
        System.out.printf("Maior número dado 3 inteiro: %d%n", maiorTres);
        System.out.println("==========================================");

        System.out.printf("Maior número dado 2 decimais (double): %.2f%n", maiorDoisDecimal);
        System.out.printf("Maior número dado 3 decimais (double) %.2f%n", maiorTresDecimal);

    }
}
