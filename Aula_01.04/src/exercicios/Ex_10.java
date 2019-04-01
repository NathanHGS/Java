package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos elementos deseja adicionar a lista:");
		int quantNuns = entrada.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < quantNuns; i++) {
			System.out.println("Digite um número:");
			int num = entrada.nextInt();
			nums.add(num);
		}
		//Maior
		int maior = 0;
		for(int i = 0; i <= nums.size() -1; i++) {
			if(nums.get(i) >= maior) {
				maior = nums.get(i);
			}
		}
		//Menor
		int menor = maior;
		for(int i = 0; i <= nums.size() -1; i++) {
			if(nums.get(i) <= menor) {
				menor = nums.get(i);
			}
		}
		//Soma de tudo
		int somaTotal = 0;
		for(int i = 0; i <= nums.size() -1; i++) {
			somaTotal+= nums.get(i);
		}
		//Elementos impares
		ArrayList<Integer> impares = new ArrayList<>();
		for(int i = 0; i <= nums.size() -1; i++) {
			if(nums.get(i) % 2 != 0) {
				impares.add(nums.get(i));
			}
		}
		//Elementos > 18
		ArrayList<Integer> maior18 = new ArrayList<>();
		for(int i = 0; i <= nums.size() -1; i++) {
			if(nums.get(i) > 18) {
				maior18.add(nums.get(i));
			}
		}
		
		System.out.println("A lista de números é: " + nums);
		System.out.println("O maior elemento da lista é: " + maior);
		System.out.println("O menor elemento da lista é: " + menor);
		System.out.println("A soma total dos elementos é: " + somaTotal);
		System.out.println("Os elementos impares da lista são: " + impares);
		System.out.println("Os elementos da lista maiores que 18 são: " + maior18);
		
		entrada.close();
	}
}
