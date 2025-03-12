package examenObjetos2023;

import java.util.HashSet;

public class Crud {

	public static HashSet<Empleado> listaEmpleados = new HashSet<>();

	public static boolean añadirEmpleado(Empleado E) {
		return listaEmpleados.add(E);
	}

	public static void mostrarEmpleados() {
		for (Empleado E : listaEmpleados) {
			System.out.println(E);
		}
	}

	public static boolean modificarHorasExtras(Empleado E, int horasExtra) {
		boolean cambio = false;
		for (Empleado emp : listaEmpleados) {
			if (emp.equals(E)) {
				emp.setHorasExtra(horasExtra);

				cambio = true;
			}

		}
		return cambio;

	}

	public static void modificarImporteHorasExtra(double importeExtra) {
		for(Empleado emp:listaEmpleados) {
			emp.setImporteExtra(importeExtra);
			emp.sueldoBruto();
		}

	}

	public static boolean eliminarEmpleado(Empleado empleado) {
		boolean cambio = false;
		if (listaEmpleados.remove(empleado)) {
			cambio = true;
		}
		return cambio;
	}

}
