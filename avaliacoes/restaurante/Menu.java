package restaurante.cefet;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    
    private List<Produto> produtos;

    public Menu(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void show()
    {
        for(Produto produto : produtos)
        {
            System.out.println(produto.getNome() + "R$" + produto.getValorProd());
        }
    }
}
