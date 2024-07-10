package especilitzacio;

public class Corda extends Instrument{
	
	public Corda(String nom, int preu) {
		super(nom, preu);
	}

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "Esta sonant un instrument de corda";
	}

	
}
