package exercicios;

import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu sexo F/M:");
		char sexo = entrada.nextLine().charAt(0);
		System.out.println("Digite sua altura:");
		double altura = entrada.nextDouble();
		System.out.println("Digite seu peso:");
		double peso = entrada.nextDouble();
		if (sexo == 'F') {
			double pesoIF = (62.1 * altura) - 44.7;
			if (peso <= pesoIF) {
				System.out.println("Você está no peso ideal, :) PARABÉNS!!!");
			} else {
				System.out.println("Infelismente você está acima do peso ideal :(");
			}
		}
		if (sexo == 'M') {
			double pesoIM = (72.7 * altura) - 58;
			if (peso <= pesoIM) {
				System.out.println("Você está no peso ideal, :) PARABÉNS!!!");
			} else {
				System.out.println("Infelismente você está acima do peso ideal :(");
			}
		}
		entrada.close();
	}

}
