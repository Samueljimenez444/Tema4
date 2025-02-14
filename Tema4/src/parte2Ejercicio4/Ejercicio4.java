package parte2Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner lectura=new Scanner(System.in);
		int eleccion;
		Pizza orden1=new Pizza(290813,"Pequeña","Margarita");
		Pizza orden2=new Pizza(290814,"Mediana","CuatroQuesos");
		Pizza orden3=new Pizza(290815,"Grande","Funghi");
		orden1.setEstado("PEDIDA");
		orden2.setEstado("PEDIDA");
		orden3.setEstado("PEDIDA");
		orden1.getEstado();
		String estado;
		boolean iguales;
		
		do {
		System.out.println("Elija una de las siguientes opciones");
		System.out.println("1 Mostrar Pizzas Disponibles");
		System.out.println("2 Comparar Pizzas");
		System.out.println("3 Cambiar estado Pizza");
		System.out.println("0 Salir del Programa");
		eleccion=lectura.nextInt();
		lectura.nextLine();
		switch(eleccion) {
		case 1:
			System.out.println(orden1);
			System.out.println(orden2);
			System.out.println(orden3);
			
			break;
		case 2:
			iguales=orden1.equals(orden1);
			System.out.println(iguales);
			iguales=orden2.equals(orden1);
			System.out.println(iguales);
			break;
		case 3:
			System.out.println("Cambia estado de la Orden 1");
			estado=lectura.nextLine().toUpperCase();
			orden1.setEstado(estado);
			
			System.out.println("Cambia estado de la Orden 2");
			estado=lectura.nextLine().toUpperCase();
			orden2.setEstado(estado);
			
			System.out.println("Cambia estado de la Orden 3");
			estado=lectura.nextLine().toUpperCase();
			orden3.setEstado(estado);
			break;
		}
		}while(eleccion!=0);
		lectura.close();
	}

}
