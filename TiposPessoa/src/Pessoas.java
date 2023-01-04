
public class Pessoas {

	public static void main(String[] args) {
		
		PessoaFísica fis = new PessoaFísica();
		
		fis.nome = "Abelardo";
		fis.cpf = "1212121212";
		fis.indentidade = "34343434";
		fis.situacaoPessoa = "Ativo";
		
	
		PessoaJurídica jur = new PessoaJurídica();
		
		jur.nome = "BateriasPotentes";
		jur.cnpj = "565656-5";
		jur.inscEstadual = "15-33-1";
		jur.situacaoPessoa = "Inativo";
		
		System.out.println("Dados da pessoa física");
		System.out.println(fis.toString());
		System.out.println("Dados da pessoa juridica");
		System.out.println(jur.toString());
	}
}
