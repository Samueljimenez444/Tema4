package parte3.Ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner lectura=new Scanner(System.in);
		int cantidad;
		int maximoValor;
		int minValor;
		
		System.out.println("Introduce el numero de numeros aleatorios que quieres generar");
		cantidad=lectura.nextInt();
		numerosAleatorios.numeros(cantidad);
		
		System.out.println("Introduce el numero de numeros aleatorios que quieres generar");
		cantidad=lectura.nextInt();
		System.out.println("Introduce el valor maximo que tomara el numero aleatorio");
		maximoValor=lectura.nextInt();
		numerosAleatorios.numeros(cantidad, maximoValor);
		
		System.out.println("Introduce el numero de numeros aleatorios que quieres generar");
		cantidad=lectura.nextInt();
		System.out.println("Introduce el valor maximo que tomaran el numero aleatorio");
		maximoValor=lectura.nextInt();
		System.out.println("Introduce el valor minimo que tomaran el numero aleatorio");
		minValor=lectura.nextInt();
		numerosAleatorios.numeros(cantidad, maximoValor,minValor);
		
		lectura.close();
	}
}
