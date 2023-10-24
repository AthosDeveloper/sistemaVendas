package venda;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("computador", 6.502);
        Produto produto1 = new Produto("vidiogame", 6.891);

        Pedido pedido = new Pedido();
        pedido.adicionarProduto(produto);
        pedido.adicionarProduto(produto1);
        pedido.calcularTotal();
        pedido.mostrarPedido();

    }
}
