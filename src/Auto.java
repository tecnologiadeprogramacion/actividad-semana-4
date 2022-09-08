
public class Auto {
	protected String marca;
	protected String color;
	protected int capacidad;
	protected int costo;
	protected String patente;
	
	public Auto(String m, String c, int cap, int cos, String p) {
		marca = m;
		color = c;
		capacidad = cap;
		costo = cos;
		patente = p;
	}
	
	public int costo() {
		return costo;
	}
	
	public int capacidad() {
		return capacidad;
	}
	
}
