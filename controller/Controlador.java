
package controller;
import model.Pedido;
import model.Produtos;
public class Controlador {
    private Pedido pedido;
    private Pedidoview view;

    public Controlador(Pedido pedido, Pedidoview view) {
        this.pedido = pedido;
        this.view = view;
    }

    public void adicionarProduto(Produtos produto) {
        try {
            pedido.adicionarPedido(produto);

        } catch (Exception e) {
            System.out.println("Erro ao adicionar produto");

        }
    }

    public void finalizarPedido() {
        view.exixbirDetalhes(pedido);
    }
}