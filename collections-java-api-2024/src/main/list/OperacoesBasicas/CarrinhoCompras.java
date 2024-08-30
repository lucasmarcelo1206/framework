package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> carrinhoCompras;

    public CarrinhoCompras() {

        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {

        carrinhoCompras.add(new Item(nome));

    }

    public static void main(String[] args) {
        CarrinhoCompras comprasCarrinho = new ArrayList<>();
    }
}
