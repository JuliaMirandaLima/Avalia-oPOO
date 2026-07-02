import controller.Controlador;
import controller.Pedidoview;
import model.Cliente;
import model.Pedido;
import model.Produtos;
import model.TipoProduto;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente ("julia", "9999999-9999", "111.111.111-45");
        Pedidoview view = new Pedidoview();
        Pedido pedido = new Pedido(cliente1);
        Controlador controlador = new Controlador(pedido,view);
        Produtos p1 = new Produtos("Mamão", 2.40, TipoProduto.LANCHE);
        Produtos p2 = new Produtos("melão", 2.90, TipoProduto.LANCHE);
        Produtos p3 = new Produtos("choolate", 2.00, TipoProduto.SOBRMESA);
        Produtos p4 = new Produtos("abacate", 6.00, TipoProduto.LANCHE);
        controlador.adicionarProduto(p1);
        controlador.adicionarProduto(p2);
        controlador.adicionarProduto(p3);
        controlador.adicionarProduto(p4);
        controlador.finalizarPedido();
        }
}