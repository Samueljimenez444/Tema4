package parte4.Ejercicio3;

public class Pizza {
	public int codigo;

	private Tamaño tamaño;

	private Tipo tipo;

	private Estado estado;

	enum Tamaño {
		PEQUEÑA, MEDIANA, GRANDE
	}

	enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	}

	enum Estado {
		PEDIDA, ENPREPARACION, SERVIDA, PAGADA
	}

	public Pizza(int codigo, String tamaño, String tipo) {

		this.codigo = codigo;
		
		switch (tamaño.toUpperCase()) {
		case "PEQUEÑA":
			this.tamaño = Tamaño.PEQUEÑA;
			break;

		case "MEDIANA":
			this.tamaño = Tamaño.MEDIANA;
			break;

		case "GRANDE":
			this.tamaño = Tamaño.GRANDE;
			break;
		}
		switch (tipo.toUpperCase()) {
		case "MARGARITA":
			this.tipo = Tipo.MARGARITA;
			break;
		case "CUATROQUESOS":
			this.tipo = Tipo.CUATROQUESOS;
			break;
		case "FUNGHI":
			this.tipo = Tipo.FUNGHI;
			break;
		}
	}
	
	public String toString() {
		String cadena;
		cadena = codigo + " - " + tamaño + " - " + tipo + " - " + estado;
		return cadena;
	}
	public boolean equals(Object pizzaComparacion){
		boolean iguales;
		Pizza otraPizza= (Pizza) pizzaComparacion;
		if (codigo == otraPizza.codigo) {
			iguales = true;
		}
		else {
		    iguales = false;
		}
		return iguales;
	}

	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public void setEstado(String estado) {
		switch (estado.toUpperCase()) {
		case "PEDIDA":
			this.estado = Estado.PEDIDA;
			break;
		case "ENPREPARACION":
			this.estado = Estado.ENPREPARACION;
			break;
		case "SERVIDA":
			this.estado = Estado.SERVIDA;
			break;
		case "COBRADA":
			this.estado = Estado.PAGADA;
			break;
		}
	}

	public Estado getEstado() {
		return estado;
	}


}
