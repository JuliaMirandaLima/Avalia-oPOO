package model;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    Cliente cliente;
    private LocalDateTime dataHora;
    private ArrayList<Produtos> produtos = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public LocalDateTime getDataHora() {
        return dataHora;
    }


    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }

    public void adicionarPedido (Produtos produto){
        if (produtos.size() > 10){
            throw new IllegalAccessError("não pode conter mais de 10 produtos no pedido");
        }
        this.produtos.add(produto);
    }


    public double calcularTotal() {
        double valorTotal = 0;
        for (Produtos produto : produtos) {
            valorTotal = valorTotal + produto.preco();
        }

        return valorTotal;

    }

}
