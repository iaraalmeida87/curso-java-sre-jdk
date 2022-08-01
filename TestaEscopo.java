
public class TestaEscopo {
	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoas = 2;
		boolean acompanhado = true;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo(a)!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
