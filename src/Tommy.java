
public class Tommy {
	protected CiudadConInmuebles miCiudad;
	protected int dinero;

	public Tommy(CiudadConInmuebles c) {
		miCiudad = c;
		dinero = 0;
	}
	
	public Auto conseguirAuto(Dealer d) {
		return null;
	}
	
	public Auto conseguirAuto(Dealer d, int capacidad) {
		return null;
	}
	
	public boolean puedePagar(int precio) {
		return precio <= dinero;
	}
	
	public void pagar(int costo) {
		dinero -= costo;
	}
}
