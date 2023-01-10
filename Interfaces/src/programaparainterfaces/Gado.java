package programaparainterfaces;

public class Gado implements Animal{

	@Override
	public void animalSom() {
		System.out.println("MUUUUU!");

	}

	@Override
	public void animalComer() {
		System.out.println("Está comendo!");
		
	}

	@Override
	public void animalAndar() {
		System.out.println("Estou andando!");
		
	}
	
}
