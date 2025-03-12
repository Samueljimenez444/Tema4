package examenObjetos2023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Empleado empleado = null;

		String nombre;

		String dni;

		int horasExtra;

		double sueldoBase;

		double importeExtra;

		int eleccion;

		Scanner lectura = new Scanner(System.in);

		do {
			System.out.println("-- MENU --");
			System.out.println("1 Añadir Empleados.");
			System.out.println("2 Listar Empleados.");
			System.out.println("3 Modificar Horas Extra.");
			System.out.println("4 Modificar Importe Horas Extra.");
			System.out.println("5 Eliminar Empleado.");
			System.out.println("0 Salir del programa.");

			eleccion = lectura.nextInt();
			lectura.nextLine();
			switch (eleccion) {

			case 1:

				System.out.println("Introduce el nombre del usuario");
				nombre = lectura.nextLine();

				System.out.println("Introduce el dni");
				dni = lectura.nextLine();

				System.out.println("Introduce el sueldo base de tu empleado");
				sueldoBase = lectura.nextDouble();

				System.out.println("Introduce el numero de horas");
				horasExtra = lectura.nextInt();

				empleado = new Empleado(dni, nombre, sueldoBase, horasExtra);

				if (Crud.añadirEmpleado(empleado)) {
					System.out.println("El empleado ha sido añadido correctamente");
				} else {
					System.out.println("El empleado no ha sido añadido correctamente");
				}
				empleado.sueldoBruto();
				break;

			case 2:

				Crud.mostrarEmpleados();

				break;
			case 3:

				System.out.println("Introduce el dni del empleado que quieras modificar");

				dni = lectura.nextLine();

				System.out.println("Introduce el nuevo valor de las horas extra trabajadas");

				horasExtra = lectura.nextInt();

				empleado = new Empleado(dni);

				if (Crud.modificarHorasExtras(empleado, horasExtra)) {
					System.out.println("Se ha modificado el valor de las horas extra");
				} else {
					System.out.println("No se ha podido modificar el valor de las horas extra");
				}

				break;
			case 4:

				System.out.println("Introduce el nuevo valor de las horas extra");

				importeExtra = lectura.nextDouble();

				Crud.modificarImporteHorasExtra(importeExtra);
				System.out.println("Se ha modificado el importe de la hora extra");
				
				break;
			case 5:
				System.out.println("Introduce el dni del Empleado que quieres eliminar");
				dni = lectura.nextLine();
				empleado = new Empleado(dni);
				if (Crud.eliminarEmpleado(empleado)) {
					System.out.println("Empleado Eliminado");
				} else {
					System.out.println("El empleado no ha sido eliminado");
				}
				break;

			}

		} while (eleccion != 0);
		System.out.println("Saliendo del sistema...");
		lectura.close();
	}

}
