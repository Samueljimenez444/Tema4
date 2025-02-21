package parte4Ejercicio2;

import java.util.ArrayList;

public class Crud {
	public static ArrayList<Articulo> listaArticulos=new ArrayList<>();
	
	public static void mostrarArticulos() {
		for(Articulo articulo: listaArticulos){
			System.out.println(articulo);
		}
	}
	
	public static void altaArticulo(Articulo articulo) {
		listaArticulos.add(articulo);
	}
	
	public static boolean bajaArticulo(Articulo articulo) {
		listaArticulos.remove(articulo);
		return listaArticulos.remove(articulo);
		
	}
	
	public static void modificarArticulo(Articulo articulo,int precio) {
		listaArticulos.get(precio).setPrecio(precio);;
		
	}
	public static void altaStock(Articulo articulo,int cuantosQuedan){
	
	}
	
}
