package exercicios;

import java.util.Scanner;

public class Ex_07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double maior = 0;
		double menor = 11;
		double nota = 0;
		int quant = 0;
		System.out.println("Para parar de digitar notas digite um n�mero negativo.");
		do {
			System.out.println("Digite uma nota: ");
			nota = entrada.nextDouble();
			if(nota >= maior && nota <= 10) {
				maior = nota;
			}else if(nota <= menor && nota >= 0) {
				menor = nota;
			}
			quant++;
		}while(nota >= 0);
		System.out.printf("A maior nota foi: %.2f \n", maior);
		System.out.printf("A menor nota foi: %.2f \n", menor);
		System.out.printf("A quantidade de alunos foi: %d \n", quant);
		entrada.close();
	}

}
