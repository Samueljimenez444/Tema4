package parte4.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int eleccion;
		Scanner lectura = new Scanner(System.in);
		String nombre;

		double precio;

		int cuantosQuedan;
		
		Articulo art = null;

		do {
			System.out.println("----MENU----");

			System.out.println("Introduzca uno de los siguientes numeros.");

			System.out.println("1. Listado.");
			System.out.println("2. Alta Articulo.");
			System.out.println("3. Baja Articulo.");
			System.out.println("4. Modificacion.");
			System.out.println("5. Entrada de Mercancia.");
			System.out.println("6. Salida de Mercancia.");
			System.out.println("0. Salir.");
			eleccion = lectura.nextInt();
			lectura.nextLine();
			switch (eleccion) {
			case 1:
				System.out.println("Lista Articulos");
				Crud.mostrarArticulos();
				break;
			case 2:
				System.out.println("Introduce los datos del articulo que vas a crear");

				System.out.println("Introduce el nombre");
				nombre = lectura.nextLine();

				System.out.println("Introduce el precio");
				precio = lectura.nextDouble();

				System.out.println("Introduce la cantidad de articulos que han entrado");
				cuantosQuedan = lectura.nextInt();

				art = new Articulo(nombre, precio, cuantosQuedan);
				Crud.altaArticulo(art);
				break;

			case 3:
				System.out.println("Introduce los datos del articulo que vas a eliminar");

				System.out.println("Introduce el nombre");
				nombre = lectura.nextLine();
				
				art.setNombre(nombre);
				if(Crud.bajaArticulo(art)){
					System.out.println("El objeto ha sido eliminado");
				}
				else {
					System.out.println("El objeto no ha sido eliminado");
				}
				
				break;

			case 4:
				System.out.println("Menu de modificacion de articulos");
				
				System.out.println("Introduce el nombre del articulo que vas a modificar");
				nombre=lectura.nextLine();
				
				System.out.println("Introduce el nuevo Precio");
				precio=lectura.nextInt();
				
				
				
				break;

			case 5:
				System.out.println("Menu entrada de stock");
				
				System.out.println("Introduce cuantos articulos han entrado nuevos");
				cuantosQuedan=lectura.nextInt();
				art.setCuantosQuedan(cuantosQuedan);
				
				Crud.altaStock(art,cuantosQuedan);
				
				break;

			case 6:

				break;
			}
		} while (eleccion != 0);
		lectura.close();
	}

}
