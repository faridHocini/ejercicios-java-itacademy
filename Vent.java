package especilitzacio;

public class Vent extends Instrument{

	//constructor
	public Vent(String nom, int preu) {
		super(nom, preu);
	}
	
	public String tocar() {
		return "Esta sonant un instrument de vent";
	}
}
