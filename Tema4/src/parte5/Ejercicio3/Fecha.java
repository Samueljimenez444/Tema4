package parte5.Ejercicio3;

public class Fecha {

	private int dia = 1;

	private int mes = 1;

	private int año = 1970;

	public Fecha(int dia, int mes, int año) {



		if (fechaCorrecta(dia, mes, año)) {
			this.dia = dia;
			this.mes = mes;
			this.año = año;
		}

		

	}

	public int getDia() {
		return this.dia;
	}

	public boolean fechaCorrecta(int dia, int mes, int año) {

		boolean esCorrecta = true;

		switch (mes) {
		case 1:
			if (dia <= 31) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 2:
			if (dia <= 28 && esBisiesto(mes) || dia <= 29) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 3:

			if (dia <= 31) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 4:

			if (dia <= 30) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 5:

			if (dia <= 31) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 6:

			if (dia <= 30) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 7:

			if (dia <= 31) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 8:

			if (dia <= 31) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 9:

			if (dia <= 30) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 10:

			if (dia <= 31) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 11:

			if (dia <= 30) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		case 12:

			if (dia <= 31) {

				esCorrecta = true;
			} else {
				esCorrecta = false;
			}

			break;

		}

		return esCorrecta;
	}

	public boolean esBisiesto(int año) {
		boolean bisiesto;
		if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
			bisiesto = true;
		} else {
			bisiesto = false;
		}
		return bisiesto;
	}

	public String toString() {
		String cadena;

		cadena = (dia + "-" + mes + "-" + año);

		return cadena;

	}

	public void pasarDia(int dia) {
		this.dia = ++dia;
		if (dia > 31) {
			this.dia = 1;
			this.mes++;
		}
		if (mes > 12) {
			this.mes = 1;
			this.año++;
		}

	}

}
