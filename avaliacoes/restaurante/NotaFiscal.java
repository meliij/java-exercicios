package restaurante.cefet;

import java.util.List;
import java.util.UUID;

public class NotaFiscal implements INFCGenerator{
    private String cnpj;
    private List<Item> itens;
    private float total;
    private Restaurante restaurante;

    @Override
    public void setId(UUID id) {
        // ...
    }

    @Override
    public void setEm(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void addProduto(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public void setTotal(float total) {
        this.total = total;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }    

    public String getCnpj() {
        return cnpj;
    }

    public List<Item> getItens() {
        return itens;
    }

    public float getTotal() {
        return total;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void listar() {
        float total = 0;
        for (Item item : itens)
        {
            Produto produto = item.getProduto();
            System.out.println("Qnt: " + item.getQuantidade() + " | Descricao: " + produto.getNome() + " | Preço Unit: R$" + item.getValorVenda() + " | Taxa: " + produto.getIva() + " | Total: R$" + (item.getQuantidade() * item.getValorVenda()));
            total += item.getQuantidade() * item.getValorVenda();
        }
        setTotal(total);
    }

    public void gerar(Pedido pedido) {
        Restaurante restaurante = getRestaurante();
        System.out.println(restaurante.getNomeFantasia() + "\n" + restaurante.getNome() + "\n" + restaurante.getEndereco().getEndereco() + "\n" + restaurante.getEndereco().getCep());
        System.out.println(pedido.getCliente().getCpf());
        System.out.println("MESA: " + pedido.getMesa().getLocal() + pedido.getMesa().getNumero());
        listar();
        System.out.println("TOTAL LIQ. R$" + getTotal());
    }
    
}
