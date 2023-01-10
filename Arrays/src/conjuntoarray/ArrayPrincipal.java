package conjuntoarray;

import javax.swing.JOptionPane;

public class ArrayPrincipal {

	public static void main(String[] args) {

		//declarando array de países
		String[] paises = new String[5];
		
		//declarando Array de numeros
		int[] numeros = new int[10];
		
		
		//abastecendo o array países com valores
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe o nome de um país: ");
		}
		
		//Listando o Array países
		for (String listaPaises : paises) {
			System.out.println(listaPaises);
		}
		
		
		//Abastecendo Array de numeros
		for (int num = 0; num < numeros.length; num++) {
			numeros[num] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
		}
		
		//Listando o Array numeros (Antes do cálculo)
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		
		//Listando o Array numeros (Depois do cálculo)
		int novoValor = -5;
		numeros[2] = novoValor + 25;
		
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
	}

}
