package parte4.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		double media;

		String nombre;

		int eleccion;

		Scanner lectura = new Scanner(System.in);

		do {
			System.out.println("----MENU----");

			System.out.println("Introduzca uno de los siguientes numeros.");

			System.out.println("1. Listado.");
			System.out.println("2. Nuevo Alumno.");
			System.out.println("3. Modificar.");
			System.out.println("4. Borrar.");
			System.out.println("0. Salir.");

			eleccion = lectura.nextInt();
			lectura.nextLine();

			switch (eleccion) {
			case 1:
				Crud.mostrarLista();
				break;

			case 2:
				System.out.println("Introduce el nombre del nuevo alumno");

				nombre = lectura.nextLine();

				System.out.println("Introduce la media del alumno");

				media = lectura.nextDouble();

				Crud.añadirAlumno(nombre, media);
				break;

			case 3:
				System.out.println("Modificacion del alumno");

				System.out.println("Introduce el nombre del alumno");
				nombre = lectura.nextLine();
				System.out.println("Introduce la nota media");
				media = lectura.nextDouble();

				Crud.modificarAlumno(nombre, media);
				break;

			case 4:
				System.out.println("Menu de borrado de alumnos");
				nombre = lectura.nextLine();
				Crud.eliminarAlumno(nombre);
				break;
			}
		} while (eleccion != 0);

		lectura.close();
	}

}
