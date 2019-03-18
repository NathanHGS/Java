package exercicio_repeticao_nota;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num = 107;
		for (int tent = 1; tent <= 21; tent++) {
			System.out.println("Digite um número:");
			int numTent = entrada.nextInt();
			if(numTent < 0) {
				System.out.println("Programa finalizado!");
				tent = 21;
			}else if (numTent == num) {
				System.out.println("Você acertou em " + tent + " tentativas");
				tent = 21;
			}else if(numTent > num) {
				System.out.println("O número é maior.");
			}else if(numTent < num){
				System.out.println("O número é menor.");
			}
		}
		entrada.close();
	}

}
