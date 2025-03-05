package parte5.Ejercicio4;

public class Fraccion {
	
	private int denominador=1;
	
	private int numerador;
	
	public Fraccion(int denominador,int numerador) {
		
		this.numerador=numerador;
		if(denominador!=0) {
		this.denominador=denominador;
		}
	}
	
	public String toString() {
		
		String cadena;
		cadena=(numerador+"/"+denominador);
		return cadena;
		
	}
	
	public int sumaFracciones(Fraccion fraccionSuma) {;
	int resultadoD;
	int resultadoN;
	this.denominador=this.denominador*fraccionSuma.denominador;
	this.numerador=this.denominador*fraccionSuma.denominador;
	this.numerador=this.numerador*fraccionSuma.denominador;
	fraccionSuma.denominador=fraccionSuma.denominador*this.numerador;
	resultadoD=fraccionSuma.denominador+this.numerador;
	resultadoN=fraccionSuma.numerador+this.numerador;
	return resultadoD;
	}
}
