package parte4.Ejercicio5;

import java.util.ArrayList;

public class Crud {

	private static ArrayList<CuentaCorriente> listaCuentas = new ArrayList<>();

	public static void listaCuentas() {
		for (CuentaCorriente cuenta : listaCuentas) {
			System.out.println(cuenta);
		}
	}

	public static boolean añadirCuentas(CuentaCorriente cuentaNueva) {
		return listaCuentas.add(cuentaNueva);
	}

	public static boolean borrarCuenta(CuentaCorriente cuentaNueva) {
		boolean borrado = false;
		for (int i = 0; i < listaCuentas.size(); i++) {
			if (listaCuentas.get(i).equals(cuentaNueva)) {
				borrado = listaCuentas.remove(cuentaNueva);
			}
		}
		return borrado;
	}

}
