package exercicios;

import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Equa��o do 2� Grau.");
		System.out.println("Digite o termo A, da equa��o:");
		int A = entrada.nextInt();
		System.out.println("Digite o termo B, da equa��o:");
		int B = entrada.nextInt();
		System.out.println("Digite o termo C, da equa��o:");
		int C = entrada.nextInt();
		double delta = 0;
		delta = ((Math.pow(B, 2)) - 4 * A * C);
		double x1 = 0;
		double x2 = 0;
		if (delta > 0) {
			x1 = (-(B) + Math.sqrt(delta)) / 2 * A;
			x2 = (-(B) - Math.sqrt(delta)) / 2 * A;
			System.out.printf("x1 = %.1f e x2 = %.1f", x1, x2);
		}else if(delta == 0) {
			x1 = (-(B) + Math.sqrt(delta)) / 2 * A;
			System.out.printf("x = %.1f", x1);
		}else if(delta < 0) {
			System.out.println("Essa equa��o n�o possui uma Raiz.");
		}
		entrada.close();
	}

}
