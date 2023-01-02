import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		Scanner ltr = new Scanner(System.in);

		System.out.println("Digite o lado 1: ");
		int l1 = ltr.nextInt();
		System.out.println("Digite o lado 2: ");
		int l2 = ltr.nextInt();
		System.out.println("Digite o lado 3: ");
		int l3 = ltr.nextInt();

		
		if ((l1 > l2 + l3) || (l2 > l1 + l3) || (l3 > l1 + l2)) {
			System.out.println("Não é um triângulo!");
			System.exit(0);
		}

		
		if ((l1 == l2) && (l2 == l3)) {
			System.out.println("É um triângulo equilátero!");
		} else if ((l1 == l2) || (l2 == l3) || (l1 == l3)) {
			System.out.println("É um triângulo Isóceles!");
		} else {
			System.out.println("É um triângulo Escaleno!");
		}
		
		ltr.close();
	}
}