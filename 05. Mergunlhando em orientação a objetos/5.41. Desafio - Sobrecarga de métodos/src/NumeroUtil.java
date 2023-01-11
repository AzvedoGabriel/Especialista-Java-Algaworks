
public class NumeroUtil {

    static int maiorInteiro(int numeroUm, int numeroDois) {
        return (numeroUm > numeroDois) ? numeroUm:numeroDois;
    }

    static int maiorInteiro(int numeroUm, int numeroDois, int numeroTres) {
        if (numeroUm > numeroDois && numeroUm > numeroTres) {
            return numeroUm;
        } else if (numeroDois > numeroUm && numeroDois > numeroTres) {
            return numeroDois;
        } else {
            return numeroTres;
        }
    }

    static double maiorInteiroDecimal(double numeroUm, double numeroDois) {
        return (numeroUm > numeroDois) ? numeroUm : numeroDois;
    }

    static double maiorInteiroDecimal(double numeroUm, double numeroDois, double numeroTres){
        if (numeroUm > numeroDois && numeroUm > numeroTres) {
            return numeroUm;
        } else if (numeroDois > numeroUm && numeroDois > numeroTres) {
            return numeroDois;
        } else {
            return numeroTres;
        }
    }
}