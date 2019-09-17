package tppumper;

public abstract class Hamburguesa {
	
	int medallonesExtra = 0;
	
//	public Hamburguesa( int medallonesExtra) {
//		this.medallonesExtra = medallonesExtra;
//	}
	
	public void addMedallon() {
	if (medallonesExtra < 3) medallonesExtra ++ ;
	else
		System.out.println("No se puede agregar mas medallones");
	}
	
	protected int getMedallonesExtra() {
		return medallonesExtra;
	}
	
	public int getPrecio() {
		return (medallonesExtra * 50); 
	}

	
	
}
