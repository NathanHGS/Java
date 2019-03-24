package exercicios;

import java.util.Scanner;

public class Ex_07 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		System.out.println("Digite o lado A de um triangulo:");
		double A = entrada.nextDouble();
		System.out.println("Digite o lado B de um triangulo:");
		double B = entrada.nextDouble();
		System.out.println("Digite o lado C de um triangulo:");
		double C = entrada.nextDouble();
		if((A + B) < C) {
			System.out.println("Isso não é um triangulo.");
		}else if (A == B && A == C && B == C ) {
			System.out.println("Esse triangulo é equilátero.");
		}else if(A != B && A != C && B != C) {
			System.out.println("Esse triangulo é escaleno.");
		} else if (A == B || A == C || B == C) {
			System.out.println("Esse triangulo é Isóseles.");
		} 
		entrada.close();
	}

}
