package parte1.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int edad;
		String nombre;
		String apellidos;
		String dni;

		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduce los datos de la primera persona");
		System.out.println("Introduce el nombre de la persona 1");
		nombre = lectura.nextLine();
		
		System.out.println("Introduce el apellido de la persona 1");
		apellidos = lectura.nextLine();
		
		System.out.println("Introduce el dni de la 1 persona");
		dni = lectura.nextLine();
		
		System.out.println("Introduzca la edad de la persona 1");
		edad = lectura.nextInt();
		lectura.nextLine();
		Persona persona1 = new Persona(nombre,apellidos,dni,edad);
		persona1.setNombre(nombre);
		persona1.setApellido(apellidos);
		persona1.setDni(dni);
		persona1.setEdad(edad);
		System.out.println(persona1);
		System.out.println("La persona es mayor de edad: "+ persona1.esMayorEdad());
		System.out.println("La persona es jubilada: "+ persona1.esJubilado());
		
		System.out.println("Introduce los datos de la segunda persona");
		System.out.println("Introduce el nombre de la persona 2");
		nombre = lectura.nextLine();
		
		System.out.println("Introduce el apellido de la persona 2");
		apellidos = lectura.nextLine();
		
		System.out.println("Introduce el dni de la 2 persona");
		dni = lectura.nextLine();
		
		System.out.println("Introduzca la edad de la persona 2");
		edad = lectura.nextInt();
		Persona persona2=new Persona(nombre,apellidos,dni,edad);
		persona2.setNombre(nombre);
		persona2.setApellido(apellidos);
		persona2.setDni(dni);
		persona2.setEdad(edad);
		System.out.println(persona1);
		System.out.println("La persona es mayor de edad: "+ persona1.esMayorEdad());
		System.out.println("La persona es jubilada: "+ persona2.esJubilado());
		
		System.out.println("La diferencia de edad entre persona 1 y persona 2 es de " +persona1.diferenciaEdad(persona2));
		
		lectura.close();
	}

}
