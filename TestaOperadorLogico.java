//Exercício para uso de operador lógico onde calcula o IR referente ao salario base
public class TestaOperadorLogico {
	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			salario = salario - 142.0;
			System.out.println("Seu salário recebe desconto de 7,5% de IR e o valor final à receber é de: " + salario);
		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				salario = salario - 350.0;
				System.out.println("Seu salário recebe desconto de 15% de IR e o valor final à receber é de: " + salario);
			} else {
				if (salario >= 3751.01 && salario <= 4664.0) {
					salario = salario - 636;
					System.out.println("Seu salário recebe desconto de 22,5% de IR e o valor final à receber é de: " + salario);
				}
			}
		}
	}
}