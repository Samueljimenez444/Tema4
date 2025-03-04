package parte3.Ejercicio4;
public class Booleanos {
	public static boolean parseBoolean(int a) {
		boolean iguales = false;
		if(a==0){
			iguales=false;
		}
		else if(a==1) {
			iguales=true;
		}
		return iguales;
	}
	
	public static boolean parseBoolean(String frase) {
		boolean iguales;
		if(frase.equals(false)){
		iguales=false;	
		}
		else {
		iguales=true;
		}
		return iguales;
	}
}
