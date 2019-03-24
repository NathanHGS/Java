package exercicios;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua massa(Kg):");
		double massa = entrada.nextDouble();
		System.out.println("Digite sua altura(M):");
		double altura = entrada.nextDouble();
		double IMC = massa / (altura * altura);
		System.out.printf("Com base em %.2fm de altura, e, %.2fKg de massa, seu IMC é %.2f", altura, massa, IMC);
		entrada.close();
	}

}
