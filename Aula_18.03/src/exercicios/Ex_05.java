package exercicios;

import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double melhor_tempo = 9999;
		int melhor_volta = 0;
		double soma = 0;
		double media = 0;
		for(int voltas = 1; voltas <= 10; voltas++) {
			System.out.printf("Digite o tempo da %d� volta:", voltas);
			double tempo = entrada.nextDouble();
			if (tempo <= melhor_tempo) {
				melhor_tempo = tempo;
				melhor_volta = voltas;
			}
			soma = soma + tempo;
		}
		media = soma / 10;
		System.out.printf("O melhor tempo foi %.2f na %d� volta.E ", melhor_tempo, melhor_volta);
		System.out.printf("A m�dia das voltas foi: %.2f", media);
		entrada.close();
	}

}
