package restaurante.cefet;

import java.util.ArrayList;

public class MyApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Praca dos Poveiros", "26013330", 86);
        Endereco enderecoFuncionario = new Endereco("Rua do Meier", "20920350", 33);
        Endereco enderecoCliente = new Endereco("Rua da Jaca", "205789003", 44);
        Menu menu = new Menu(new ArrayList<Produto>());
        Mesa mesa = new Mesa("213", "Terrace");
        Restaurante restaurante = new Restaurante("Anvileo Rooftop, Lda.", "12345678912345", "Casa Guedes", endereco, new ArrayList<Mesa>(), menu);
        Funcionario funcionario = new Funcionario("Bia", "123456789-01", enderecoFuncionario, "12345678901", "Garçom", new ArrayList<Mesa>());
        Cliente cliente = new Cliente("Layza", "17527967760", endereco, 0);
        Produto coca = new Produto("Coca-Cola", 7);
        Produto cachaca = new Produto("Cachacinha", 33);
        Produto batata = new Produto("Batata Frita", 20);
        Produto hamburger = new Produto("Cheeseburger", 9);
        Produto milkshake = new Produto("Milkshake", 15);
        Item item1 = new Item(coca, 1);
        Item item2 = new Item(cachaca, 1);
        Item item3 = new Item(batata, 2);
        Item item4 = new Item(hamburger, 2);
        Item item5 = new Item(milkshake, 1);
        Pedido pedido = new Pedido(159, new ArrayList<Item>(), mesa, cliente, new Pix(), new NotaFiscal());
        pedido.getNotaFiscal().setRestaurante(restaurante);
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);
        itens.add(item5);
        pedido.setItens(itens);
        pedido.getNotaFiscal().addProduto(itens);
        pedido.encerrar();
        
    }
}