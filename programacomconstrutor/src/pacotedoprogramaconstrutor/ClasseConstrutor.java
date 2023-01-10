package pacotedoprogramaconstrutor;

public class ClasseConstrutor {

	//Definindo os atributos da classe 
	private double nota1, nota2, nota3;
	STATUS situacaoAluno;
	MATRICULA matriculaAluno;
	
	//Criando um construtor
	public ClasseConstrutor(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public enum STATUS {
		APROVADO,
		REPROVADO
	}
	
	public enum MATRICULA {
		MATRICULADO,
		PENDENTE,
		RECUSADO
	}
	public double calcularMediaFinal() {
		double mediaAluno = 0;
		
		mediaAluno = (this.nota1 + this.nota2 + this.nota3)/3;
		return mediaAluno;
	}
}
