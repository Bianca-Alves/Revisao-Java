
public class Principal {

	public static void main(String[] args) {

		circulo cir = new circulo(7);
		quadrado qua = new quadrado(5);
		triangulo tri = new triangulo(8, 3);
		retangulo ret = new retangulo(9, 9);

		cir.printArea();
		qua.printArea();
		tri.printArea();
		ret.printArea();
	}
}