
public class Relacionais_Logicos {

	public static void main(String[] args) {

		int num1, num2;
		
		//Operadores Relacionais 
		// == != >= <= > <
		
		
		//Testando comparação
		num1 = 10;
		num2 = 10;
		if (num1 == num2) {
			System.out.println("num1 e num2 são iguais.");
		}
		
		//Testando Diferente de
		num1 = 10;
		num2 = 1;
		if (num1 != num2) {
			System.out.println("num1 e num2 são diferentes.");
		}
		
		//Testando Maior que
		num1 = 120;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("num1 é maior que num2.");
		}
		
		//Testando Menor que
		num1 = 1;
		num2 = 10;
		if (num1 < num2) {
			System.out.println("num1 é menor que num2.");
		}
		
		//Testando Maior ou igual
		num1 = 10;
		num2 = 10;
		if (num1 >= num2) {
			System.out.println("num1 é maior ou igual a num2.");
		}
		
		//Testando Menor ou igual
		num1 = 20;
		num2 = 220;
		if (num1 <= num2 ) {
			System.out.println("num1 é menor ou igual a num2.");
		}		
		
		//Operadores Lógicos
		// E/AND = &&     OU/OR = ||     NÃO/NO = !
		num1 = 20; num2 = 5;
	int num3 = 10, num4 = 5; 	
		if ((num1 > num3) && (num2 == num4)) {
			System.out.println("Primeira opção satisfeita!");
		} else {
			System.out.println("Segunda opção satisfeita!");
		}
		//Alterando o num1
		num1 = 5;
		
		if (!(num1 > num3) || (num2 == num4)) {
			System.out.println("Primeira opção satisfeita!");
		} else {
			System.out.println("Segunda opção satisfeita!");
		}
		
	}

}
