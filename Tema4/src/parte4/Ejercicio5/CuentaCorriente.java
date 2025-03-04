package parte4.Ejercicio5;

public class CuentaCorriente {
	enum Nacionalidad {
		EXTRANJERO, ESPAÑOL
	}

	Nacionalidad nacionalidad;

	private String dni;
	private String nombre;
	private double saldo;
	private Nacionalidad nacion;

	public CuentaCorriente(String dni) {
		if (dni.length() == 9) {
			this.dni = dni;
		}
	}

	public CuentaCorriente(String dni, String nombre, int saldo, String nacionalidad) {
		if (dni.length() == 9) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
		switch (nacionalidad.toUpperCase()) {
		case "ESPAÑOLA":
			this.nacion = Nacionalidad.ESPAÑOL;
			break;
		case "EXTRANJERA":
			this.nacion = Nacionalidad.EXTRANJERO;
			break;
		default:
			this.nacion = Nacionalidad.ESPAÑOL;
		}
	}

	public CuentaCorriente(String dni, int saldo) {
		if (dni.length() == 9) {
			this.dni = dni;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(String dni, String nombre, int saldo) {
		if (dni.length() == 9) {
			this.dni = dni;
		}
		if (nombre != null) {
			this.nombre = nombre;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}

	}

	// Nacionalidad nacionalidadCliente = nacionalidad.valueOf(nacion);

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacarDinero(double saldo, double dineroExtraido) {
		this.saldo = saldo;
		boolean sacar;
		if (dineroExtraido > saldo) {
			sacar = false;
		} else {
			this.saldo = saldo - dineroExtraido;
			sacar = true;
		}

		return sacar;
	}

	public boolean ingresarDinero(double saldo, double dineroIngresado) {
		this.saldo = saldo;
		boolean ingresar;
		if (dineroIngresado <= 0) {
			ingresar = false;
		} else {
			ingresar = true;
		}
		return ingresar;
	}

	public String toString() {
		String cadena;
		cadena = "DNI: " + dni + " Nombre: " + nombre + " Nacion: " + nacion + " Saldo: " + saldo;
		return cadena;
	}

	public boolean equals(Object cuenta) {
		boolean iguales;
		CuentaCorriente otraCuenta = (CuentaCorriente) cuenta;
		if (this.dni.equals(otraCuenta.dni)) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
