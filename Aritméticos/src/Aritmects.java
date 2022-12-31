
public class Aritmects {

	public static void main(String[] args) {

		int n1, n2, n3;

		// adição
		n1 = 10;
		n2 = 20;
		n3 = n1 + n2;
		System.out.println("O valor da adição é : " + n3);

		// subtração
		n1 = 10;
		n2 = 20;
		n3 = n1 - n2;
		System.out.println("O valor da subtração é : " + n3);

		// Multiplicação
		n1 = 10;
		n2 = 39;
		n3 = n1 * n2;
		System.out.println("O valor da multiplicação é : " + n3);

		// Divisão
		n1 = 10;
		n2 = 2;
		n3 = n1 / n2;
		System.out.println("O valor da divisão é : " + n3);
		
		//Separando operações de incremento e decremento
		System.out.println();
		
		// Incrementando de 1 em 1
		n1 = 1;
		while (n1 <= 10) {
			System.out.println(n1);
			n1++;
		}
		
		//Outra separação
		System.out.println("=======================");

		// Decrementando de 1 em 1
		n1 = 10;
		while (n1 >= 0) {
			System.out.println(n1);
			n1--;
		}

	}

}
