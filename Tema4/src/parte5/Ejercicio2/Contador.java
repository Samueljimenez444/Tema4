package parte5.Ejercicio2;

public class Contador {

	private int cont;

	public Contador(int contador) {
		if (contador >= 0) {
			this.cont = contador;
		}
	}

	public int getContador() {
		return cont;
	}

	public void setContador(int contador) {
		this.cont = contador;
	}

	public void incrementarContador(int contador) {
		this.cont = ++contador;
	}

	public void decrementarContador(int contador) {
		this.cont = --contador;
	}

	public String toString() {

		String cadena;
		cadena = ("Contador Actual: " + cont);

		return cadena;
	}

}
