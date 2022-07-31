
public class TestaValores {
	//Usei o main+Ctrl+Espaço para o autocomplete escrever a linha 4 automaticamente
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;

		// quanto vale o segundo?
		//5 porque a variável guarda o valor e não referências
		System.out.println(segundo);
		
	}
}
