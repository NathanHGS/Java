package exercicios;

import java.util.Scanner;

public class Ex_11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		int num = entrada.nextInt();
		double aux1 = 1;
		double aux2 = 1;
		double soma = 0;
		for(int i = 1; i <= num; i++) {
			soma = soma + (aux1 / aux2);
			aux1++;
			aux2+=2;
		}
		System.out.printf("A resultado da soma �: ~%.2f", soma);
		entrada.close();
	}

}
