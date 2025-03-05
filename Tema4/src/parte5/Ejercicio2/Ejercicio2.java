package parte5.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int eleccion;

		int contador = 0;

		Scanner lectura = new Scanner(System.in);

		Contador cont = null;
		do {
			System.out.println("-- MENU --");
			System.out.println("1 Definir contador.");
			System.out.println("2 Aumentar contador.");
			System.out.println("3 Decrementar contador.");
			System.out.println("4 Mostrar contador");

			eleccion = lectura.nextInt();

			switch (eleccion) {
			case 1:

				System.out.println("Introduce el valor del contador actual");

				contador = lectura.nextInt();

				cont = new Contador(contador);

				break;

			case 2:

				cont.incrementarContador(cont.getContador());

				break;

			case 3:

				cont.decrementarContador(cont.getContador());

				break;

			case 4:
				System.out.println(cont);
				break;
			}
		} while (eleccion != 0);
		lectura.close();

	}

}
