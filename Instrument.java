package especilitzacio;

public abstract class  Instrument {
	
	//Atributs
	private String nom;
	private int preu;
	
	//Constructor
	public Instrument(String nom, int preu) {
		
		this.nom = nom;
		this.preu = preu;
	}
		
		//Getters i setters
		
		public void setNom(String nom) {
		
			this.nom = nom;
		}
		
	

		public String getNom() {
			return nom;
		}

	
	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	public abstract String tocar();
}
