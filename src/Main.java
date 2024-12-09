import model.Cliente;
import model.Produto;
import model.Venda;

public class Main {
    public static void main(String[] args) {
        Produto biscoito = new Produto("Biscoito", 5.50, 500);
        Produto suco = new Produto("Suco", 2.50, 10);

        Cliente joao = new Cliente("João", "123456789");

        Venda novaVenda = new Venda(joao);
        novaVenda.addProduto(biscoito);
        novaVenda.addProduto(suco);
        System.out.println(novaVenda.getValorTotal());
    }
}