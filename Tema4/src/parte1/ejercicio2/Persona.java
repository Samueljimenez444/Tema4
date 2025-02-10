package parte1.ejercicio2;

public class Persona {

	private int edad;
	private String dni;
	private String nombre;
	private String apellidos;

	public Persona(String nombre, String apellidos, String dni, int edad) {
		this.edad = edad;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellido(String apellidos) {
		this.apellidos=apellidos;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public boolean esMayorEdad() {
		boolean mayor;
		if(this.edad>=18) {
			mayor=true;
		}
		else {
			mayor=false;
		}
		return mayor;
	}
	public boolean esJubilado() {
		boolean jubilado;
		if(this.edad>=65) {
			jubilado=true;
		}
		else {
			jubilado=false;
		}
		return jubilado;
	}
	public int diferenciaEdad(Persona p) {
		int diferencia;
		diferencia=this.edad-p.edad;
		return diferencia;
	}
	public String toString() {
		
		return ("DNI: "+ this.dni +" Nombre: " +this.nombre +" Apellidos: "+ this.apellidos+" Edad: "+this.edad);
	}
}
