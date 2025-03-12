package parte5.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numerador;
		
		int denominador;
		
		Fraccion fraccion=null;
		
		Fraccion fraccionSumada=null;
		
		int eleccion;
		
		Scanner lectura=new Scanner(System.in);
		
		do {
			
			System.out.println("-- MENU --");
			System.out.println("1 Introduce los datos de la fraccion");
			System.out.println("2 Suma de fracciones.");
			System.out.println("3 Mostrar fraccion .");
			System.out.println("4 Resta de fracciones");
			System.out.println("5 Multiplicacion de fracciones");
			System.out.println("6 Dividir Fracciones");
			System.out.println("7 Simplificar Fracciones");
			
			eleccion=lectura.nextInt();
			
			switch(eleccion) {
			case 1:
				System.out.println("Introduce el numerador");
				numerador=lectura.nextInt();
				
				System.out.println("Introduce el denominador");
				denominador=lectura.nextInt();
				
				fraccion=new Fraccion(numerador,denominador);
				
				break;
				
			case 2:
				
				System.out.println("Introduce el numerador de la fraccion que vamos a sumar");
				numerador=lectura.nextInt();
				
				System.out.println("Introduce el denominador de la fraccion que vamos a sumar");
				denominador=lectura.nextInt();
				
				fraccionSumada=new Fraccion(numerador,denominador);
			
				System.out.println(fraccion.sumaFracciones(fraccionSumada));
				break;
				
			case 3:
				
				System.out.println(fraccion);
				
				break;
				
			}
		}while(eleccion!=0);
		lectura.close();

	}

}
