package restaurante.cefet;

public class Produto {
    private String nome;
    private float valorProd;
    private int lucro = 5;
    private float iva = (float) 1.23;
    
    public Produto(String nome, float valorProd) {
        this.nome = nome;
        this.valorProd = valorProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorProd() {
        return valorProd;
    }

    public void setValorProd(float valorProd) {
        this.valorProd = valorProd;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public int getLucro() {
        return lucro;
    }

    public void setLucro(int lucro) {
        this.lucro = lucro;
    }
}
