
public class TestaCaracteres {
	public static void main(String[] args) {
		//Aqui a String é usada para guardar um texto
		//char é um tipo de variável que guarda apenas 1 caracter, por isso usamos String
		//String, diferente dos outros tipos de variáveis, começa com maiúsculo
		//No valor da String usamos aspas duplas " e no valor da char usamos aspas simples '
		String palavra = "alura cursos online de tecnologia ";
		System.out.println(palavra);
		//Aqui concatenamos uma String com um número que foi implicitamente transformado em String também
		palavra = palavra + 2022;
		System.out.println(palavra);
	}
}
