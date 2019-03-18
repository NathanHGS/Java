package exercicio_repeticao_nota;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o valor da compra:");
		double valor = entrada.nextDouble();
		if(valor <= 100) {
			double porcentagem = (valor * 5) / 100;
			double total = valor - porcentagem;
			System.out.println("O valor da compra com uma porcentagem de 5% é: " + total);;
		}else if(valor > 100 && valor < 200) {
			double porcentagem = (valor * 10) / 100;
			double total = valor - porcentagem;
			System.out.println("O valor da compra com uma porcentagem de 10% é: " + total);;
		}else if(valor >= 200) {
			double porcentagem = (valor * 15) / 100;
			double total = valor - porcentagem;
			System.out.println("O valor da compra com uma porcentagem de 15% é: " + total);;
		}
	entrada.close();
	}

}
