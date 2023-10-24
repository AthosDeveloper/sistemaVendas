package venda;

public class Pedido {
    private final Integer ID_PEDIDO = ++Pedido.contadorPedido;
    private Produto produtos[];
    private Integer contadorProdutos = 0;
    private static Integer contadorPedido = 0;
    private static final Integer MAX_PRODUTOS = 10;

    public Pedido() {

        this.produtos = new Produto[Pedido.MAX_PRODUTOS];
    }

    public void adicionarProduto(Produto produto) {
        if (this.contadorProdutos < Pedido.MAX_PRODUTOS) {
            produtos[contadorProdutos++] = produto;
        } else {
        System.out.println("Você superou a quantidade de produtos disponíveis " + Pedido.MAX_PRODUTOS);
        }
    }

    public Double calcularTotal() {
        Double total = 0.0;
        for (int i = 0; i < this.contadorProdutos; i++) {
            total += this.produtos[i].getPreco();

        }
        return total;
    }
public void mostrarPedido(){

    System.out.println("id do pedido: " + this.ID_PEDIDO);
    System.out.println("total do pedido: " + this.calcularTotal());
    System.out.println();
    System.out.println("produtos do pedido:");
    for (int i = 0; i < this.contadorProdutos; i ++){
        System.out.println(this.produtos[i]);

    }


}

}

