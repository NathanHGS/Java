package exercicios;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um, primeiro número(Inteiro):");
		int n1 = entrada.nextInt();
		System.out.println("Digite um, segundo número(Inteiro):");
		int n2 = entrada.nextInt();
		System.out.println("Digite um, terceiro número(Inteiro):");
		int n3 = entrada.nextInt();
		int maior = 0;
		if (n1 > maior) {
			maior = n1;
		}
		if(n2 > maior) {
			maior = n2;
		}
		if (n3 > maior){
			maior = n3;
		}
		System.out.printf("Entre os três números, %d é o maior.", maior);
		entrada.close();
	}

}