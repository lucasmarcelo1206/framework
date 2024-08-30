package main.list.OperacoesBasicas;

public class Item {

    String nome;
    Double preco;
    int quantidade;

    public Item(String nome) {
        this.nome = nome;
    }

    public Item(Double preco) {
        this.preco = preco;
    }

    public Item(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
