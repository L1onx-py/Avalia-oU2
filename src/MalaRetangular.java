import java.util.Objects;

public class MalaRetangular implements ItemASerEmbaladoIF {

    private double lado1;
    private double lado2;
    private double peso;

    public MalaRetangular(double lado1, double lado2, double peso) throws Exception {

        testaLado1(lado1);
        testaLado2(lado2);
        testaPeso(peso);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.peso = peso;
    }

    private void testaLado1 (double lado1) throws Exception {
        if (lado1 <= 0)
            throw new Exception("O lado1 tem que ser maior que zero");
    }

    private void testaLado2(double lado2) throws Exception {
        if (lado2 <= 0)
            throw new Exception("O lado2 tem que ser maior que zero");
    }

    private void testaPeso(double peso) throws Exception {
        if (peso <= 0)
            throw new Exception("O peso tem que ser maior que zero");
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado1(double lado1) throws Exception {
        testaLado1(lado1);
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) throws Exception {
        testaLado2(lado2);
        this.lado2 = lado2;
    }

    public void setPeso(double peso) throws Exception {
        testaPeso(peso);
        this.peso = peso;
    }


    @Override
    public double calculaArea() {
        return (getLado1() * getLado2());
    }

    @Override
    public double calculaQtdeEmbalagem() {
        return (getPeso()*calculaArea());
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public String getDescricaoEmbalagem() {
        return "Mala Retangular: " + calculaQtdeEmbalagem();
    }

    @Override
    public String toString() {
        return "MalaRetangular{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", peso=" + peso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MalaRetangular that)) return false;
        return Double.compare(lado1, that.lado1) == 0 && Double.compare(lado2, that.lado2) == 0 && Double.compare(peso, that.peso) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado1, lado2, peso);
    }
}


