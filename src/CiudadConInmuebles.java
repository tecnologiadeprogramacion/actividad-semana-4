import java.util.LinkedList;

public class CiudadConInmuebles extends Ciudad {

	public CiudadConInmuebles() {
		misInmuebles = new LinkedList<Inmueble>();
	}
	
	public Iterable<Inmueble> inmuebles(){
		return misInmuebles;
	}
}
