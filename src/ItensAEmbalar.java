import java.util.List;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "ItensAEmbalar{" +
                "itens=" + itens +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItensAEmbalar that = (ItensAEmbalar) o;
        return Objects.equals(itens, that.itens);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itens);
    }
}
