import java.util.Iterator;

public class Dealer {
	protected int seriePatente;
	protected Ciudad miCiudad;
	protected Personaje miPersonaje;
	protected int dinero;
	
	public Dealer(Ciudad c, Personaje p) {
		miCiudad = c;
		miPersonaje = p;
		seriePatente = 0;
		dinero = 0;
	}
	
	public Auto buscarAuto() {
		Auto toReturn = null;
		int valorAPagar;
		// Busca autos en ciudad
		for(Auto a: miCiudad.iterableAutos()) {
			valorAPagar = a.valor();
			if (miPersonaje.puedePagar(valorAPagar)) {
				miPersonaje.pagar(valorAPagar);
				dinero += valorAPagar;
				toReturn = a;
				break;
			}
		}
		
		// Si no hallo un auto para el personaje
		if (toReturn == null) {
			toReturn = armarAuto();
		}
		return toReturn;
	}
	
	public Auto buscarAuto(int capacidad) {
		Auto toReturn = null;
		int valorAPagar;
		
		// Busca autos en ciudad con determinada capacidad
		for(Auto a: miCiudad.iterableAutos()) {
			if(a.capacidad() == capacidad) {
				valorAPagar = a.valor() + 200;
				if (miPersonaje.puedePagar(valorAPagar)) {
					miPersonaje.pagar(valorAPagar);
					dinero += valorAPagar;
					toReturn = a;
					break;
				}
			}
		}
		
		// Si no hallo un auto para el personaje
		if (toReturn == null) {
			toReturn = armarAuto();
		}
		return toReturn;
	}
	
	private Auto armarAuto() {
		return null;
	}
}
