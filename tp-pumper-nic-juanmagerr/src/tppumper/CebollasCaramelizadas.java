package tppumper;

public class CebollasCaramelizadas extends Hamburguesa{
	
	Hamburguesa hamburguesa;
	
	public CebollasCaramelizadas ( Hamburguesa hamburguesa ) {
		this.hamburguesa = hamburguesa;
	}
	
	public Hamburguesa getHamburguesa() {
		return hamburguesa;
	}
	
	@Override
	public int getPrecio() {
	return getHamburguesa().getPrecio() + 60;
	}
	
}