package basicproject;

import java.util.Scanner;

public class ProjetoBasico {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// Declarando a personagem principal.
		String personagemPrincipal;

		// Começando o Jogo
		System.out.println("Você acorda atordoado na sua cama.");
		System.out.println(".........");
		System.out.println("Sua mãe o chama, dizendo que o café está pronto. O que você faz?");
		System.out.println(
				"Sistema de escolhas, você terá sempre 3 opções, escolha uma e veja como a história desenrola.");
		// Escolhendo
		System.out.println("1 - Estou indo mãe!; 2 - Ah velha chata!; 3 - Caminhar até a cozinha silenciosamente;");
		int escolhaDeAcao = leitor.nextInt();

		// Eventos para cada uma das escolhas permitidas.
		switch (escolhaDeAcao) {
		// "Estou indo mãe!"
		case 1:
			System.out.println("Você não escuta nada em retorno, então se levanta e começa a caminhar pela porta.");
			System.out.println("Aliás, qual seu nome?");
			personagemPrincipal = leitor.next();
			break;

		// "Ah velha chata!"
		case 2:
			System.out.println("Sua mãe entra furiosa no quarto com uma faca na mão e crava ela no seu peito!");
			System.out.println("Você morreu! Fim de jogo!");
			
			break;
		// "Caminhar até a cozinha silenciosamente."
		case 3:
			System.out.println("Sua mãe lhe cumprimenta com um sorriso e puxa uma cadeira pra você se sentar.");
			// Você MORREU!
		default:
			System.out.println(
					"Sua mãe entra furiosa no quarto grintando: VOCÊ É SURDO CACETE? e crava uma faca no seu peito, você morre ali mesmo!");
			break;
		}

		System.out.println("Sua comida está posta na mesa, então você se senta e começa a comer.");
		System.out.println(".........");
		System.out.println("Você termina de comer, veste seu casaco e vai até a porta.");
		System.out.println("Sua mãe pede para você trazer lenha quando retornar para casa.");
		System.out.println(".........");

		System.out.println(
				"Você agora esta do lado de fora da sua casa, você pode ir para o norte, leste, oeste ou entrar novamente em casa.");
		// Sistema de escolha iniciado
		System.out.println(" 1 - Ir para o norte; 2 - Ir para o Leste; 3 - Ir para o Oeste; 4 - Entrar em casa; ");
		escolhaDeAcao = leitor.nextInt();

		switch (escolhaDeAcao) {
		// Indo para o Norte
		case 1:
			System.out.println("Você começa a ir pro norte até que encontra uma cabana de lenhador.");
			System.out.println("Você deseja entrar na cabana? S/s - sim;  N/n-não");
			char escolhaPorTexto = leitor.next().charAt(0);

			if (escolhaPorTexto == 'S' || escolhaPorTexto == 's') {
				System.out.println(
						"Lembranças do seu falecido pai vem a sua mente quando você abre a porta da cabana e sente o cheiro do lugar...");
				System.out.println("Você vê um machado sobre a mesa de centro.");
				System.out.println("Minha mãe pediu que eu levasse lenha, preciso levar senão vou morrer...");

			} else {
				System.out.println("Vou para outro lugar, ainda não é hora de pegar madeira.");
				System.out.println("Você está na frente de sua casa de novo!");
			}
			break;
		// Indo para o Leste
		case 2:

			System.out.println("Indo por leste você encontra uma estrada para o centro de sua vila.");
			System.out.println(
					"Nãh, ainda não é hora de ir para a vila. Tenho que pegar lenha para minha mãe, não quero morrer...");
			System.out.println(".........");
			System.out.println("Você está na frente de sua casa de novo!");
			break;
		// Indo para o Oeste
		case 3:
			System.out.println(
					"Você caminha até chegar em uma pedreira antiga, tem uma picareta na entrada caso queira minerar.");
			System.out.println("Meu pai morreu ai, a mina foi proibida para uso pelo prefeito desde então...");
			System.out.println("Melhor cair fora!");
			System.out.println(".........");
			System.out.println("Você está na frente de sua casa de novo!");
			break;
		// Entrando em casa novamente
		case 4:
			System.out.println("Sua mãe vê você e pergunta da lenha.");
			int madeira = 0;
			if (madeira == 0) {
				System.out.println(
						"Então vai lá buscar a lenha, vai vai - Fala sua mãe te empurrando para fora de casa.");
				System.out.println("Você está na frente de sua casa de novo!");
			} else {
				System.out.println("Eu estou com a lenha, devia ir encontrar minha mãe!");
			}
			break;
		}
	}

}
