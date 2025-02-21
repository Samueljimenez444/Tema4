package parte2Ejercicio3;
import java.util.Scanner;
public class Ejercicio3 { 
	public static void main(String[] args) {
		int eleccion;
		boolean iguales;
		Scanner lectura = new Scanner(System.in);
		Alumno alumno1 = new Alumno("Samuel", 10);
		Alumno alumno2 = new Alumno("Samuel", 5);
		Alumno alumno3 = new Alumno("Mohamed", 7);
		do {
			System.out.println("Elija una opcion");
			System.out.println("1 Mostrar informacion de alumnos");
			System.out.println("2 Comparacion Alumnos");
			eleccion = lectura.nextInt();
			switch (eleccion) {
			case 1:
				System.out.println("Informacion de los Alumnos");
				System.out.println(alumno1);
				System.out.println(alumno2);
				System.out.println(alumno3);
				break;
			case 2:
				System.out.println("Comparacion de los alumnos");
				iguales = alumno1.equals(alumno3);
				System.out.println(iguales);
				break;
			} 
		} while (eleccion != 0);
		lectura.close();
	}
	
}
