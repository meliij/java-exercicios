package restaurante.cefet;

import java.util.List;

public class Pedido {
    private int numeroPedido;
    private float valorTotal;
    private List<Item> itens;
    private Mesa mesa;
    private Cliente cliente;
    private Pagamento pagamento;
    private NotaFiscal notaFiscal;

    public Pedido(int numeroPedido, List<Item> itens, Mesa mesa, Cliente cliente, Pagamento pagamento,
            NotaFiscal notaFiscal) {
        this.numeroPedido = numeroPedido;
        this.itens = itens;
        this.mesa = mesa;
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.notaFiscal = notaFiscal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public void listar() {
        for (Item item : itens)
        {
            System.out.println(item.getProduto().getNome() + " - R$" + item.getValorVenda());
        }
    }

    public void encerrar() {
        System.out.println("CONTA:");
        listar();
        pagar();
    }

    public void pagar() {
        System.out.println("PAGO COM: " + getPagamento().getTipo() + "\n");
        notaFiscal.gerar(this);
    }
}
