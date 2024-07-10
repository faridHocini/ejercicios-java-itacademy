package especilitzacio;

public class Exercici1N1 {

	public static void main(String[] args) {

		Corda guitarra = new Corda("guitarra", 300);
		System.out.println(guitarra.tocar());
		
		Percussio tambor = new Percussio("tambor", 200);
		System.out.println(tambor.tocar());

		Vent flauta = new Vent("flauta", 100);
		System.out.println(flauta.tocar());
	}

	

}
