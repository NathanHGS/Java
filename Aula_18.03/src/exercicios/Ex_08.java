package exercicios;

import java.util.Scanner;

public class Ex_08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Para para de inserir notas, digite uma nota negativa.");
		int maior_6 = 0;
		int entre_4e6 = 0;
		int menor_4 = 0;
		double nota = 0;
		do {
			System.out.println("Digite uma nota:");
			nota = entrada.nextDouble();
			if(nota >= 6 && nota <= 10) {
				maior_6++;
			}else if(nota >= 4 && nota < 6) {
				entre_4e6++;
			}else if(nota < 4 && nota >= 0) {
				menor_4++;
			}
		}while(nota >= 0);
		System.out.printf("Foram maior que 6: %d notas;\n", maior_6);
		System.out.printf("Foram entre 4 e 6: %d notas;\n", entre_4e6);
		System.out.printf("Foram menores q 4: %d notas.", menor_4);
		entrada.close();
	}

}
