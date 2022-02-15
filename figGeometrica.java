
public abstract class figGeometrica {

	protected String nomeFig;

	// Getters e Setters
	public String getNomeFig() {
		return nomeFig;
	}

	public void setNomeFig(String nomeFig) {
		this.nomeFig = nomeFig;
	}

	// Métodos
	public abstract double calcArea();

	public void printArea() {
		System.out.println("A área do " + this.getNomeFig() + " é: " + this.calcArea());
	}
}