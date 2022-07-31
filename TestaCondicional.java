//Utilizando if e else (condicionais)
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 16;
		int quantidadePessoas = 2;

		if (idade >= 18) {
			System.out.println("Você tem mais que 18 anos.");
			System.out.println("Seja bem vindo!");
		} else {
			//Acrescentando outra condicional
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entrar, pois está acompanhado");
			} else {
				System.out.println("Infelizmente você não pode entrar.");
			}
		}
	}
}