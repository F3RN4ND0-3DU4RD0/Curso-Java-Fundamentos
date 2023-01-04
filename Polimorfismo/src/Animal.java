
public class Animal {

	public static void main(String[] args) {
		
		Mamifero animal1 = new Elefante();
		Mamifero animal2 = new Rato();
		
		System.out.println(animal1.cotaDiariaLeite());
		System.out.println(animal2.cotaDiariaLeite());
	}

}
