package exercicios;

import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int subtracao = 0;
		System.out.println("Digite um número:");
		int n1 = entrada.nextInt();
		System.out.println("Digite outro número:");
		int n2 = entrada.nextInt();
		if (n1 >= n2) {
			subtracao = n1 - n2;
			System.out.printf("%d - %d = %d", n1, n2, subtracao);
		}else if(n2 >= n1) {
			subtracao = n2 - n1;
			System.out.printf("%d - %d = %d", n2, n1, subtracao);
		}
		entrada.close();
	}

}
