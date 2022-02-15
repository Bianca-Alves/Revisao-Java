
public class triangulo extends figGeometrica {

	private double largura;
	private double altura;

	// Construtor
	public triangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
		this.nomeFig = "tri�ngulo";
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

	// M�todos
	@Override
	public double calcArea() {
		return ((this.getLargura() * this.getAltura()) / 2);
	}

	public double calcArea(double largura, double altura) {
		return ((largura * altura) / 2);
	}
}