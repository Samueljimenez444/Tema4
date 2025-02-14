package parte2Ej2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		Libro libro1 = new Libro("Flying Spaghetti Monster", "Samuel", 12, "NARRATIVO");
		Libro libro2 = new Libro("Flying Pizza Monster", "Osama", 100, "DIDACTICO");
		int eleccion;
		boolean acciones = false;
		int prestamos = 0;

		do {
			System.out.println("Elige una de las siguientes opciones");
			System.out.println("1 Prestamos de libros");
			System.out.println("2 Devoluciones de libros");
			System.out.println("3 Informaciones de libros");
			System.out.println("4 Comparacion de libros");
			System.out.println("0 Salir del programa");

			eleccion = lectura.nextInt();
			lectura.nextLine();
			switch (eleccion) {
			case 1:

				acciones = libro1.prestamo(libro1.getEjemplares());
				if (acciones == false) {
					System.out.println("El libro no ha podido ser prestado");
				} else {
					System.out.println("El libro ha sido prestado correctamente");

				}
				break;
			case 2:
				acciones = libro1.devolucion(prestamos, libro1.getEjemplares());
				if (acciones == false) {
					System.out.println("El libro no ha podido ser devuelto");
				} else {
					System.out.println("El libro ha sido devuelto correctamente");
					prestamos--;
				}
				break;
			case 3:
				System.out.println(libro1);
				break;
			case 4:
				System.out.println("Comparacion de libros introduce el titulo de los libros que quieres comparar");
				libro1.equals(libro2);
				break;
			}
		} while (eleccion != 0);
		lectura.close();
	}
}
