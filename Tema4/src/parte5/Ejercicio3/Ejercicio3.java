package parte5.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		int dia = 1;

		int mes = 1;

		int año = 0;

		Fecha fecha = null;

		int eleccion;

		do {
			System.out.println("-- MENU --");
			System.out.println("1 Mostrar Fecha.");
			System.out.println("2 Definir Fecha actual.");
			System.out.println("3 Año bisiesto?");
			System.out.println("4 Pasar un dia");

			eleccion = lectura.nextInt();

			switch (eleccion) {
			case 1:

				System.out.println(fecha);

				break;

			case 2:

				System.out.println("Introduce el dia");
				dia = lectura.nextInt();

				System.out.println("Introduce el mes");
				mes = lectura.nextInt();

				System.out.println("Introduce el año");
				año = lectura.nextInt();

				fecha = new Fecha(dia, mes, año);

				break;

			case 3:

				if (fecha.esBisiesto(año)) {
					System.out.println("El año es bisiesto");
				} else {
					System.out.println("El año no es bisiesto");
				}

				break;

			case 4:
				fecha.pasarDia(fecha.getDia());
				break;
			}

		} while (eleccion != 0);

		lectura.close();

	}

}
