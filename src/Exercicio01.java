import java.util.Scanner;

public class Exercicio01 {
		//Quando um valor pode ser alterado pelo programador, mas não sofre alterações
		//na execução do programa, podemos criar uma CONSTANTE. Nada mais
		//é do que um nome identificador para um valor
		static final double COTACAO = 5.04;
	
	public static void main(String[] args) {
		//As variáveis abaixo foram criadas com double pois armazenam valores
		// com casas decimais
		double reais, dolares;
		Scanner leitor = new Scanner(System.in);
		System.out.println("CONVERSOR DE MOEDAS");
		System.out.println("Digite o valor da doação recebida em dólares");
		dolares = leitor.nextDouble();
		reais = dolares * COTACAO;
		//Para exibir o valor com duas casas decimais, utilizamos o método format("%.2f",valor)
		System.out.println("O valor da doação recebida em reais foi de R$" + String.format("%.2f",reais));
		leitor.close();

	}

}
