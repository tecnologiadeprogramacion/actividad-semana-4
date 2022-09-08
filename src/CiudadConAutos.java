import java.util.LinkedList;

public class CiudadConAutos extends Ciudad {
	
	public CiudadConAutos() {
		misAutos = new LinkedList<Auto>();
	}
	
	public void agregarAuto(Auto a) {
		misAutos.add(a);
	}
	
	public Iterable<Auto> autos(){
		return misAutos;
	}
}
