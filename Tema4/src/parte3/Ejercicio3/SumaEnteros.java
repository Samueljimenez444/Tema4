package parte3.Ejercicio3;

public class SumaEnteros {

	public static int sumaEnteros(int a) {
		int sucesion = 0;
		for (int i = 0; i <= a; i++) {
			sucesion += i;
		}
		return sucesion;
	}

	public static int sumaEnteros(int a, int b) {
		int sucesion = 0;
		int max = Math.max(a, b);
		int min = Math.min(a, b);

		for (int i = min; i <max; i++) {
			sucesion += i;

		}

		return sucesion;
	}

}
