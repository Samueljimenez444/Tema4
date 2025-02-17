package parte3.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int a;

		int b;

		double aa;

		double bb;

		int suma;

		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduce el primer numero");
		a = lectura.nextInt();

		System.out.println("Introduce el segundo numero");
		b = lectura.nextInt();

		System.out.println(Sumas.Suma(a, b));

		System.out.println("Introduce el primer numero");
		aa = lectura.nextDouble();

		System.out.println("Introduce el segundo numero");
		bb = lectura.nextDouble();

		System.out.println(Sumas.Suma(aa, bb));
		lectura.close();

	}

}
