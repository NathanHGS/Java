package repeticao;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n = 0;
		do {
			System.out.println("Digite um número:");
			n = input.nextInt();
		}while (n >= 0);
	input.close();
	}
}
