
public class quadrado extends figGeometrica {

	private double largura;

	// Construtor
	public quadrado(double largura) {
		this.largura = largura;
		this.nomeFig = "quadrado";
	}

	// Getters e Setters
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	// M�todos
	@Override
	public double calcArea() {
		return (this.getLargura() * this.getLargura());
	}

	public double calcArea(double altura) {
		return (largura * largura);
	}
}