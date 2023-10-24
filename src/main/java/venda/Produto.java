package venda;

public class Produto {
    private final Integer ID_PRODUTO = ++Produto.contadorProdutos;
    private static Integer contadorProdutos = 0;
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {

        this.nome = nome;
        this.preco = preco;
    }

    public Integer getID_PRODUTO() {
        return ID_PRODUTO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "ID_PRODUTO=" + ID_PRODUTO +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

