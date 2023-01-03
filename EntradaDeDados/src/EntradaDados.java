import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		// Entrada de Dados via JOptionPane
		
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a idade"));
		JOptionPane.showMessageDialog(null, "A idade do elements é " + idade);
	}

}
