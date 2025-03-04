package parte4.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		CuentaCorriente cuenta = null;

		String dni;

		int saldo;

		String nombre;

		String nacion;

		int eleccion;

		Scanner lectura = new Scanner(System.in);

		do {

			System.out.println("-- MENU--");
			System.out.println("1. Mostrar Cuentas Corrientes.");
			System.out.println("2. Añadir una nueva Corriente.");
			System.out.println("3. Eliminar una Cuenta Existente.");
			System.out.println("0 Salir del programa.");

			eleccion = lectura.nextInt();

			lectura.nextLine();

			switch (eleccion) {
			case 1:

				Crud.listaCuentas();

				break;

			case 2:

				System.out.println("Introduce tu dni");

				dni = lectura.nextLine();

				System.out.println("Introduce tu nombre");

				nombre = lectura.nextLine();

				System.out.println("Introduce tu nacion");

				nacion = lectura.nextLine();

				System.out.println("Introduce un saldo inicial");

				saldo = lectura.nextInt();

				lectura.nextLine();

				cuenta = new CuentaCorriente(dni, nombre, saldo, nacion);

				if (Crud.añadirCuentas(cuenta)) {
					System.out.println("La cuenta ha sido creada correctamente");
				} else {
					System.out.println("La cuenta corriente no ha sido creada");
				}

				break;

			case 3:

				System.out.println("Introduce el dni de la cuenta que quieres borrar");

				dni = lectura.nextLine();

				cuenta = new CuentaCorriente(dni);

				if (Crud.borrarCuenta(cuenta)) {
					System.out.println("La cuenta ha sido borrada correctamente");
				} else {
					System.out.println("La cuenta corriente no ha sido eliminada");
				}

				break;

			}
		} while (eleccion != 0);
		lectura.close();

	}

}
