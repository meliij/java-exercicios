package restaurante.cefet;

import java.util.List;
import java.util.UUID;

public interface INFCGenerator {
    public void setId(UUID id);
    public void setEm(String cnpj);
    public void addProduto(List<Item> itens);
    public void setTotal(float total);
}
