package Cardapio;

import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        itens = Arrays.copyOf(itens,itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        ItemCardapio[] itensCardapio = new ItemCardapio[itens.length - 1];

        System.arraycopy(itens, 0, itensCardapio, 0, indice);
        System.arraycopy(itens, indice + 1, itensCardapio, indice, itensCardapio.length - indice);

        itens = itensCardapio;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

}
