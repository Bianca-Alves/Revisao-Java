
public class retangulo extends figGeometrica {

	private double largura;
	private double altura;

	// Construtor
	public retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
		this.nomeFig = "retângulo";
	}

	// Getters e Setters
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Métodos
	@Override
	public double calcArea() {
		return (this.getAltura() * this.getLargura());
	}

	public double calcArea(double altura, double largura) {
		return (altura * largura);
	}
}