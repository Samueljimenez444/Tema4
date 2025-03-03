package parte4.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int codigo;
		
		int duracion;
		
		String autor;
		
		String genero;
		
		String titulo;
		
		Scanner lectura=new Scanner(System.in);
		
		int eleccion;
		
		Disco disco=null;
		
		do {
		System.out.println("-- MENU --");
		System.out.println("1 Listado.");
		System.out.println("2 Nuevo Disco.");
		System.out.println("3 Borrar Disco.");
		System.out.println("0 Salir.");
		eleccion=lectura.nextInt();
		lectura.nextLine();
		
		switch(eleccion) {
		
		case 1:
		
		break;
		
		case 2:
		System.out.println("Añade un disco");
		
		System.out.println("Introduce el codigo");
		codigo=lectura.nextInt();
		lectura.nextLine();
		
		System.out.println("Introduce el titulod del disco");
		titulo=lectura.nextLine();
		
		System.out.println("Introduce el autor del disco");
		autor=lectura.nextLine();
		
		System.out.println("Introduce la duracion del disco");
		duracion=lectura.nextInt();
		lectura.nextLine();
		
		System.out.println("Introduce el genero musical del disco");
		genero=lectura.nextLine();
		
		disco=new Disco(codigo,autor,titulo,duracion);
		
		disco.setGenero(genero);
		
		break;
		
		case 3:
			
		break;
		}
		
		}while(eleccion!=0);

	}

}
