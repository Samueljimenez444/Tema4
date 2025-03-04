package parte4.Ejercicio2;

import java.util.ArrayList;

public class Crud {
	public static ArrayList<Articulo> listaArticulos = new ArrayList<>();

	public static void mostrarArticulos() {
		int i = 1;
		for (Articulo articulo : listaArticulos) {
			System.out.println(i + ": " + articulo);
			i++;
		}
	}

	public static void altaArticulo(Articulo articulo) {
		listaArticulos.add(articulo);
	}

	public static boolean bajaArticulo(Articulo art) {
		listaArticulos.remove(art);
		return listaArticulos.remove(art);
	}

	public static boolean modificarArticulo(Articulo articulo, double precio) {
		boolean modificacion;
		for (int i = 0; i < listaArticulos.size(); i++) {
			articulo.equals(listaArticulos.get(i));
			articulo.setCuantosQuedan(listaArticulos.get(i).getCuantosQuedan());
			;
		}
		modificacion = listaArticulos.remove(articulo);

		listaArticulos.add(articulo);
		return modificacion;

	}

	public static boolean altaStock(Articulo articulo, int subidaStock) {
		boolean modificacion;
		int stockActual = 0;
		for (int i = 0; i < listaArticulos.size(); i++) {
			if (articulo.equals(listaArticulos.get(i))) {
				articulo.setPrecio(listaArticulos.get(i).getPrecio());
				;
				stockActual = listaArticulos.get(i).getCuantosQuedan();
			}
		}
		stockActual += subidaStock;
		articulo.setCuantosQuedan(stockActual);
		modificacion = listaArticulos.remove(articulo);

		listaArticulos.add(articulo);
		return modificacion;
	}

	public static boolean bajaStock(Articulo articulo, int bajadaStock) {
		boolean modificacion;
		int stockActual = 0;

		for (int i = 0; i < listaArticulos.size(); i++) {
			if (articulo.equals(listaArticulos.get(i))) {
				articulo.setPrecio(listaArticulos.get(i).getPrecio());
				;
				stockActual = listaArticulos.get(i).getCuantosQuedan();
			}
		}

		if (stockActual > 0) {
			stockActual -= bajadaStock;
			articulo.setCuantosQuedan(stockActual);
			modificacion = listaArticulos.remove(articulo);
		} else {
			modificacion = false;
		}

		listaArticulos.add(articulo);
		return modificacion;

	}
}
