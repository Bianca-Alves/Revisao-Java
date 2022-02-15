
public abstract class figGeometrica {

	protected String nomeFig;

	// Getters e Setters
	public String getNomeFig() {
		return nomeFig;
	}

	public void setNomeFig(String nomeFig) {
		this.nomeFig = nomeFig;
	}

	// M�todos
	public abstract double calcArea();

	public void printArea() {
		System.out.println("A �rea do " + this.getNomeFig() + " �: " + this.calcArea());
	}
}