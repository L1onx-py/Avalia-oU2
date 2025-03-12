
public class PratoRedondo implements ItemASerEmbaladoIF {
	private double raio;
	private double peso;

	public PratoRedondo(double peso, double raio) throws Exception {
		testaRaio(raio);
		testaPeso(peso);
		this.raio = raio;
		this.peso = peso;
	}

	private void testaRaio(double raio) throws Exception {
		if(raio <= 0)
			throw new Exception("Raio tem que ser maior que zero");
	}

	private void testaPeso(double peso) throws Exception {
		if(peso <= 0)
			throw new Exception("Peso tem que ser maior que zero");
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) throws Exception {
		testaRaio(raio);
		this.raio = raio;
	}

	public void setPeso(double peso) throws Exception {
		testaPeso(peso);
		this.peso = peso;
	}

	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double calculaQtdeEmbalagem() {
		return getPeso()*calculaArea();
	}

	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public String getDescricaoEmbalagem() {
		return "Prato redondo: " + calculaQtdeEmbalagem();
	}

	@Override
	public String toString() {
		return "PratoRedondo{" +
				"raio=" + raio +
				", peso=" + peso +
				'}';
	}

	@Override
	public final boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof PratoRedondo that)) return false;

        return Double.compare(getRaio(), that.getRaio()) == 0 && Double.compare(getPeso(), that.getPeso()) == 0;
	}

	@Override
	public int hashCode() {
		int result = Double.hashCode(getRaio());
		result = 31 * result + Double.hashCode(getPeso());
		return result;
	}
}
