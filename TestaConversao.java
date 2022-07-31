
public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        //Aqui forçamos uma double a ser convertida em int, fazendo isso o decimal será ignorado e resultará apenas o número inteiro
        int valor = (int) salario;
        System.out.println(valor);
    }
}