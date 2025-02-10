package parte2Ej1;

public class CuentaCorriente {
		public String dni;
		public String nombre;
		public int saldo;
		public String nacion;
		enum nacionalidad{
			EXTRANJERO,ESPAÑOL
		}
		nacionalidad nacionalidadCliente=nacionalidad.valueOf(nacion);
		public CuentaCorriente(String dni,int saldo){
			this.dni=dni;
			this.saldo=saldo;
		}
		public CuentaCorriente(String dni,String nombre,int saldo) {
			this.dni=dni;
			this.nombre=nombre;
			this.saldo=saldo;
		}
		public CuentaCorriente(String dni,String nombre,int saldo,nacionalidad nacionalidad) {
			this.dni=dni;
			this.nombre=nombre;
			this.saldo=saldo;
			this.nacionalidadCliente=nacionalidad;
		}
}
