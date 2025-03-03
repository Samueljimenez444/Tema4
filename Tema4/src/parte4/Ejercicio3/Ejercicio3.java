package parte4.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int eleccion;
		
		Pizza pizza=null;

		int codigo;
		
		String tipo;
		
		String estado;
		
		String tamaño;
		
		Scanner lectura = new Scanner(System.in);

		do {
			System.out.println("----MENU----");

			System.out.println("Introduzca uno de los siguientes numeros.");

			System.out.println("1. Listado.");
			System.out.println("2.  Nuevo Pedido.");
			System.out.println("3. Pizza Servida.");
			System.out.println("0. Salir.");
			
			eleccion = lectura.nextInt();
			lectura.nextLine();
			
			switch (eleccion) {
			case 1:
				
				Crud.mostrarPizzas();
				
				break;
				
			case 2:
				
				System.out.println("Introduzca los datos del nuevo pedido");
				
				System.out.println("Introduzca el codigo de la pizza");
				codigo=lectura.nextInt();
				lectura.nextLine();
				
				System.out.println("Introduzca el tipo de pizza");
				tipo=lectura.nextLine();
				System.out.println("Introduzca el tamaño de la pizza");
				
				tamaño=lectura.nextLine();
				System.out.println("Introduzca el estado de la pizza");
				estado=lectura.nextLine();
				
				pizza=new Pizza(codigo,tamaño,tipo);
				
				pizza.setEstado(estado);
				
				Crud.nuevoPedido(pizza);
				
				break;

			case 3:
				System.out.println("Introduzca el codigo de la pizza que sera servida");
				
				codigo=lectura.nextInt();
				
				pizza.setCodigo(codigo);
				
				Crud.pizzaServida(pizza);
				
				break;
			}

		} while (eleccion != 0);
		lectura.close();
	}

}
