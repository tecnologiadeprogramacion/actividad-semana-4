
public class Dealer {
	protected CiudadConAutos miCiudad;
	protected int contadorPatente;
	protected int dinero;
	
	public Dealer(CiudadConAutos c) {
		miCiudad = c;
		contadorPatente = 0;
		dinero = 0;
	}
	
	public Auto buscarAuto(Tommy t) {
		Auto toReturn = null;
		int costoAuto;
		
		// Busca un auto que pueda pagar tommy
		for(Auto a : miCiudad.autos()) {
			costoAuto = a.costo();
			if (t.puedePagar(costoAuto)) {
				toReturn = a;
				t.pagar(costoAuto);
				dinero += costoAuto;
				break;
			}
		}
		
		// Si no se consiguio un auto para tommy
		if (toReturn == null) {
			toReturn = crearAuto();
		}
		
		return toReturn;
	}
	
	public Auto buscarAuto(int capacidad, Tommy t) {
		Auto toReturn = null;
		int costoAuto;
		
		// Busca un auto que pueda pagar tommy
		for(Auto a : miCiudad.autos()) {
			costoAuto = a.costo() + 200;
			if (t.puedePagar(costoAuto) && a.capacidad() == capacidad) {
				toReturn = a;
				t.pagar(costoAuto);
				dinero += costoAuto;
				break;
			}
		}
		
		// Si no se consiguio un auto para tommy
		if (toReturn == null) {
			toReturn = crearAuto();
		}
		
		return toReturn;
	}
	
	private Auto crearAuto() {
		String patente;
		Auto toReturn;
		
		patente = "BAT-MAN-"+contadorPatente;
		contadorPatente++;
		toReturn = new Auto("MarcaDealer", "negro", 4, 0, patente);
		
		miCiudad.agregarAuto(toReturn);
		
		return toReturn;
	}
	
}
