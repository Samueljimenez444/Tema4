package parte1.ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		Articulo articulo1 = new Articulo("Pijama", 10, 5);
		articulo1.setCuantosQuedan(5);
		articulo1.setNombre("Pijama");
		articulo1.setPrecio(10);
		System.out.println("Pijama-Precio:10-IVA:21%-PVP:" + (articulo1.getPrecio() + articulo1.getPrecio() * articulo1.iva / 100));
		articulo1.precio = articulo1.getPrecio() + (articulo1.getPrecio() * articulo1.iva / 100);
		System.out.println(articulo1.getPrecio());
	}

}
