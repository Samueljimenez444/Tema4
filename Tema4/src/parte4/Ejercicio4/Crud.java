package parte4.Ejercicio4;
import java.util.ArrayList;
public class Crud {
	public static ArrayList<Disco> listaDiscos=new ArrayList<>();
	
	public static void mostrarDiscos(){
		for(Disco disco:listaDiscos) {
		System.out.println(disco);
		}
	}
	
	public static void añadirDiscos(Disco disco) {
		listaDiscos.add(disco);
	}
	
	public static void borrarDisco(Disco disco) {
		for(int i=0;i<listaDiscos.size();i++){
			if(listaDiscos.get(i).equals(disco)) {
				listaDiscos.remove(i);
			}
		}
	}
	
}
