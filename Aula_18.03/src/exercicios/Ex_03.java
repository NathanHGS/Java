package exercicios;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número:");
		int n = input.nextInt();
		for(int i = 0; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", n, i, (n*i));
		}
		input.close();
	}

}
