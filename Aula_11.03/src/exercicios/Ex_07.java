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
			System.out.println("Isso n�o � um triangulo.");
		}else if (A == B && A == C && B == C ) {
			System.out.println("Esse triangulo � equil�tero.");
		}else if(A != B && A != C && B != C) {
			System.out.println("Esse triangulo � escaleno.");
		} else if (A == B || A == C || B == C) {
			System.out.println("Esse triangulo � Is�seles.");
		} 
		entrada.close();
	}

}
