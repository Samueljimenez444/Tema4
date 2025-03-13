package examenObjetosCoches;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int eleccion;
		Scanner lectura=new Scanner(System.in);
		
		do {
			System.out.println("-- MENU --");
			System.out.println("1 .");
			System.out.println("2 .");
			System.out.println("3 .");
			System.out.println("4 .");
			System.out.println("5 .");
			System.out.println("0 .");

			eleccion=lectura.nextInt();
			switch(eleccion) {
			case 1:
				
				break;
			}
		}while(eleccion!=0);
		lectura.close();
		
	}

}
