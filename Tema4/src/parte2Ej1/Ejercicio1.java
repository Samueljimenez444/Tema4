package parte2Ej1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int eleccion;
		double sacar;
		double ingresar;
		
		Scanner lectura = new Scanner(System.in);

		

		CuentaCorriente cuenta1 = new CuentaCorriente("77873441H","Samuel",100,"ESPAÑOL");
		CuentaCorriente cuenta2 = new CuentaCorriente("77873445N","Claudia",1000, "EXTRANJERO");
		do {
		System.out.println("Elige una de las siguientes opciones");
		System.out.println("1 Sacar Dinero");
		System.out.println("2 Ingresar Dinero");
		System.out.println("3 Informacion de tu cuenta corriente");
		System.out.println("4 Comparar cuentas");
		eleccion = lectura.nextInt();
		lectura.nextLine();
		switch(eleccion) {
		case 1:
			System.out.println("Introduce cuanto dinero quieres sacar");
			sacar=lectura.nextInt();
			lectura.nextLine();
			cuenta1.sacarDinero(cuenta1.getSaldo(), sacar);
			break;
		case 2:
			System.out.println("Introduce cuanto dinero quieres introducir en tu cuenta");
			ingresar=lectura.nextInt();
			lectura.nextLine();
			cuenta1.ingresarDinero(cuenta1.getSaldo(), ingresar);
			break;
		case 3:
			System.out.println(cuenta1);
			break;
		case 4:
			System.out.println(cuenta1.equals(cuenta2));
			break;
		}
		} while (eleccion != 0);

		lectura.close();
	}

}
