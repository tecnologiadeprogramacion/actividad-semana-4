import java.util.LinkedList;
import java.util.List;

public class Ciudad {
	protected List<Auto> misAutos;
	protected List<Inmueble> misInmuebles;
	
	public Ciudad(){
		misAutos = new LinkedList<Auto>();
		misInmuebles = new LinkedList<Inmueble>();
	}
	
	public void agregarAuto(Auto a) {
		misAutos.add(a);
	}
	
	public void eliminarAuto(Auto a) {
		misAutos.remove(a);
	}
	
	public Iterable<Auto> iterableAutos(){
		return misAutos;
	}
	
	public void agregarInmueble(Inmueble i) {
		misInmuebles.add(i);
	}
	
	public void eliminarInmueble(Inmueble i) {
		misInmuebles.remove(i);
	}
	
	public Iterable<Inmueble> iterableInmuebles(){
		return misInmuebles;
	}
	
}
