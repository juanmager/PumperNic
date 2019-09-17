package tppumper;

public class HamburguesaCarne extends Hamburguesa{
	
	
	@Override
	public int getPrecio(){
		return super.getPrecio() + 200;
	}

}
