package especilitzacio;

public class Percussio extends Instrument {

	
	public Percussio(String nom, int preu) {
		super(nom, preu);
	}
	
	public String tocar() {
	return "Esta sonant un instrument de percussio";
}
}