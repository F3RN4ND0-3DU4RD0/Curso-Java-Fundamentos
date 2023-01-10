package pacotedoprogramaconstrutor;

import pacotedoprogramaconstrutor.ClasseConstrutor.MATRICULA;
import pacotedoprogramaconstrutor.ClasseConstrutor.STATUS;

public class ClassePrincipal {

	public static void main(String[] args) {
		//Instnciando a classe
		ClasseConstrutor aluno = new ClasseConstrutor(9, 3, 8);
		
		//Criando a variável mediaFinalAluno
		double mediaFinalAluno = aluno.calcularMediaFinal();
		
		//Verificando se o aluno está asprovado
		if (mediaFinalAluno < 6) {
			aluno.situacaoAluno = STATUS.REPROVADO;
		}else {
			aluno.situacaoAluno = STATUS.APROVADO;
		}
		
		//Descobrindo se o aluno está matriculado
		if(mediaFinalAluno > 7) {
			aluno.matriculaAluno = MATRICULA.MATRICULADO;
		}else if (mediaFinalAluno > 6) {
			aluno.matriculaAluno = MATRICULA.PENDENTE;
		}else {
			aluno.matriculaAluno = MATRICULA.RECUSADO;
		}
		
		//Mostrando na tela situação e média do aluno
		System.out.printf("A situação do aluno é de "+ aluno.situacaoAluno +" e a media do aluno é: %.2f", mediaFinalAluno);
		
		System.out.println();
		//Mostrando se o aluno está matriculado
		System.out.println("Situação da matrícula do aluno: " + aluno.matriculaAluno);
	}
}
