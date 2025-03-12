import java.util.List;

public class ItensAEmbalar {
    public List<ItemASerEmbaladoIF> itens;

    public int adicionaItem(ItemASerEmbaladoIF item){
        itens.add(item);
        return itens.size() - 1;
    }

    public double calculaQtdeTotalDeEmbalar(){
        double total = 0;
        for (ItemASerEmbaladoIF item : itens) {
            total += calculaQtdeTotalDeEmbalar();
        }
        return total;
    }

    public String listaItensAEmabalar(){
        StringBuilder sb = new StringBuilder();
        for (ItemASerEmbaladoIF item : itens) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }


}
