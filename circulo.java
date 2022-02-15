
public class circulo extends figGeometrica {

	private double raio;
	private static double pi = 3.14159265359;

	// Construtor
	public circulo(double raio) {
		this.raio = raio;
		this.nomeFig = "círculo";
	}

	// Getters e Setters
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public static double getPi() {
		return pi;
	}

	// Métodos
	@Override
	public double calcArea() {
		return ((this.getRaio() * this.getRaio()) * circulo.getPi());
	}

	public static double calcArea(double raio) {
		return ((raio * raio) * circulo.getPi());
	}
}