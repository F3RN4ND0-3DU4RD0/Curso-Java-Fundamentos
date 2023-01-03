
public class Repetidores {

	public static void main(String[] args) {
		
		//Comando WHILE - pré-testado
		System.out.println("---------- Comando While ----------");
		int qtdVezes = 1;
		
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo pela " + qtdVezes + "º vez.");
			qtdVezes++;
		}
		System.out.println("Executei " + (qtdVezes - 1) + " vezes e sai do loop!");
	
		
		//Comando Do While - pós-testado
		System.out.println("---------- Comando Do/While ----------");
		qtdVezes = 1;
		do {
			System.out.println("Estou fazendo pela " + qtdVezes + "º vez.");
			qtdVezes++;
		} while (qtdVezes <= 10);
		System.out.println("Executei " + (qtdVezes - 1) + " vezes e sai do loop!");
		
		//FOR
		System.out.println("---------- Comando For ----------");
		qtdVezes = 0;
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo pela " + qtdVezes1 + "º vez.");
			qtdVezes = qtdVezes1;
		}
		System.out.println("Executei " + qtdVezes + " vezes e sai do loop!");
	}
}
