
public class TestaCondicional2 {
	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoas = 1;
	//Utilizando o OU || para uma coida ou outra eu o E && para uma coisa e outra
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo(a)!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}