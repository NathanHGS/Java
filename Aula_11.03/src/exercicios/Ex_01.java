package exercicios;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma nota:");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite outra nota:");
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.printf("A média das notas %.2f e %.2f é: %.2f", nota1, nota2, media);
		entrada.close();
	}

}
