package examenObjetos2023;

import java.util.Objects;

public class Empleado {
	private String dni;
	private String nombre;
	private double sueldoBase;
	private int horasExtra;
	private static double importeExtra = 10;

	public Empleado(String dni, String nombre, double sueldoBase, int horasExtra) {
		this.dni = dni;

		this.nombre = nombre;

		this.sueldoBase = sueldoBase;

		this.horasExtra = horasExtra;
	}

	public Empleado(String dni) {
		this.dni = dni;
		;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public void setImporteExtra(double importeExtra) {
		Empleado.importeExtra = importeExtra;
	}

	public double calcularComplemento() {
		double complemento;
		complemento = horasExtra * importeExtra;
		return complemento;
	}

	public void sueldoBruto() {
		double sueldo;
		sueldo = sueldoBase + calcularComplemento();
		sueldoBase=sueldo;
	}

	public String toString() {
		String cadena;
		cadena = (dni + " " + nombre + " Horas Extras: " + horasExtra + " Sueldo Bruto: " + sueldoBase);

		return cadena;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Empleado otroEmpleado = (Empleado) obj;
		if (otroEmpleado.dni.equals(this.dni)) {
			iguales = true;
		}
		return iguales;
	}

}
