import javax.swing.JOptionPane;

public class EstudoDeMatrizes {

	public static void main(String[] args) {
		
		String[] alunos = {"ROBERTO","ANA","ISRAELE"};
		
		float[][] notas = new float[3][4];
		
		float somaNotas = 0, mediaAluno;
		
		for (int i = 0; i < 3; i++) {
		
			System.out.println("Aluno: " + alunos[i]);
						
			
			for (int j = 0; j < 4; j++) {
			
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe as notas: "));
				somaNotas = somaNotas + notas[i][j];
				
			}
			
			System.out.println("============== BOLETIM ==============");
			for (int j1 = 0; j1 < 4; j1++) {
				System.out.println((j1+1) + " - " + notas[i][j]);	
			}
			
			
			
			
			
			
			
			
			
		}
				
	}

}
