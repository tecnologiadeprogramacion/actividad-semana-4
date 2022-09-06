
public class Personaje {
	protected int dinero;
	
	
	public boolean puedePagar(int monto) {
		return (monto <= dinero);
	}
	
	public void pagar(int monto) {
		dinero -= monto;
	}
}
