package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println("Quantos elementos deseja adicionar na sua lista:");
		int quant = entrada.nextInt();
		for(int i = 1; i <= quant; i++) {
			System.out.println("Digite um número:");
			int n = entrada.nextInt();
			nums.add(n);
		}
		for(int i = nums.size() -1; i >=0)
		entrada.close();
	}
}
