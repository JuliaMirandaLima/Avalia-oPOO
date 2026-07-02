package controller;
import model.Pedido;
import model.Produtos;



public class Pedidoview {
    public void exixbirDetalhes(Pedido pedido){
        System.out.println("Detalhes");
        System.out.println("cliente :" + pedido.getCliente().getNome());
        System.out.println("CPF : " + pedido.getCliente().getCPF());
        System.out.println("Telefone : " + pedido.getCliente().getNome());
        System.out.println("Produtos:");
        for (Produtos p: pedido.getProdutos()) {
            System.out.println("Nome do produto : " + p.nome() +"  preço :" + p.preco() + "tipo do produto : " + p.tipoProduto() ); 
        }
        System.out.println("Data/Hora do pedido : " + pedido.getDataHora());
        System.out.println("Valor total : " + pedido.calcularTotal());
        
        
        

    }
}
