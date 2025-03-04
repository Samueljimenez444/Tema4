package parte3.Ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
	
public static void main(String[] args) {
		Scanner lectura=new Scanner(System.in);
		String frase = " ";
		int a;
	
		System.out.println("Introduce 1 o 0");
		a=lectura.nextInt();
		while(a!=1 && a!=0) {
		System.out.println("Introduce 1 o 0!!!");
		a=lectura.nextInt();
		}
		lectura.nextLine();	
		while(!frase.equalsIgnoreCase("False") && !frase.equalsIgnoreCase("True")){
			System.out.println("Introduce true o false");
			frase=lectura.nextLine();	
		}
		System.out.println(Booleanos.parseBoolean(frase));
		System.out.println(Booleanos.parseBoolean(a));
		lectura.close();
	}
}
