package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Venda {
    private Cliente cliente;
    private List<Produto> produtos;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new LinkedList<>();
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double getValorTotal() {
        double total = 0;
        for (Produto p : this.produtos) {
            total += p.getPreco();
        }
        return total;
    }
}
