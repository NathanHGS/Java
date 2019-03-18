package exercicios;

public class Ex_02 {
	public static void main(String[] args) {
		int media = 0;
		int cont = 0;
		for (int i = 13; i <= 73; i++) {
			media = media + i;
			cont++;
		}
		System.out.printf("A média aritimética dos número de 13 a 73 é: %d", (media / cont));
	}

}
