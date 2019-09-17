package tppumper;

public class Mollejas extends Hamburguesa{
	
	Hamburguesa hamburguesa;
	
	public Mollejas ( Hamburguesa hamburguesa ) {
		this.hamburguesa = hamburguesa;
	}
	
	public Hamburguesa getHamburguesa() {
		return hamburguesa;
	}
	
	@Override
	public int getPrecio() {
	return getHamburguesa().getPrecio() + 80;
	}
	
}