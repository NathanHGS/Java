package exercicios;

public class Ex_04 {
	public static void main(String[] args) {
		double tamanhoChico = 1.50;
		double tamanhoZe = 1.10;
		int anos = 0;
		while(tamanhoZe <= tamanhoChico) {
			tamanhoZe+=0.3;
			tamanhoChico+=0.2;
			anos++;
		}
		System.out.printf("Levar� %d anos para que Z� seja maior que Chico.", anos);
	}
}