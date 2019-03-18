package exercicios;

public class Ex_01 {
	public static void main(String[] args) {
		int soma = 0;
		for(int i = 0; i <= 100; i += 2) {
			soma = soma + i;
		}
		System.out.printf("A soma dos número pares de 1 a 100 é: %d", soma);
	}
}

