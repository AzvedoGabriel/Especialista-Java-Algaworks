import com.algaworks.polimorfismo.EmpresaLucroReal;
import com.algaworks.polimorfismo.EmpresaSimples;
import com.algaworks.polimorfismo.GestorDeImpostos;
import com.algaworks.polimorfismo.PessoaFisica;

public class PrincipalImposto {
    public static void main(String[] args) {
        var gestorImpostos = new GestorDeImpostos();

        var lucas = new PessoaFisica("Lucas Felipe", 45_500);
        var maria = new PessoaFisica("Maria Dolores", 180_000);

        var petMais = new EmpresaSimples("Pet Mais", 150_000, 100_00);
        var o2 = new EmpresaLucroReal("O2 design", 200_000, 60_000);

        gestorImpostos.adicionar(lucas);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(petMais);
        gestorImpostos.adicionar(o2);

        System.out.printf("Total de impostos: R$%2f", gestorImpostos.getValorTotalImpostos());
    }
}