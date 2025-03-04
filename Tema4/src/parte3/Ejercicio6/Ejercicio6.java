package parte3.Ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner lectura=new Scanner(System.in);
		int numero;
		double numero2;
	
		System.out.println("Introduce el numero para realizar el sumatorio");
		
		numero=lectura.nextInt();
		
		System.out.println(FuncionesMatematicas.mates(numero));
		
		
		System.out.println("Introduce el numero para realizar la funcion exponencial");
		
		numero2=lectura.nextDouble();
		
		System.out.println("Introduce el numero de veces que vamos a multiplicar el numero");
		numero=lectura.nextInt();
		
		System.out.println(FuncionesMatematicas.mates(numero2, numero));
		
		System.out.println("Introduce el numero para realizar la sucesion de fibonacci");
		
		numero=lectura.nextInt();
		
		System.out.println(FuncionesMatematicas.fibonacci(numero));
		
		
		lectura.close();
		
		
	}
}
