package exercicios;

import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int soma = 0;
		double media = 0;
		int quant_acima_90 = 0;
		double porcent_de_pessoas = 0;
		double quant_porcent_pessoa = 0;
		for(int info = 1; info <= 10; info++) {
			System.out.printf("Digite a idade da %dª pessoa: ", info);
			int idade = entrada.nextInt();
			System.out.printf("Digite o peso da %dª pessoa: ", info);
			double peso = entrada.nextDouble();
			System.out.printf("Digite a altura da %dª pessoa: ", info);
			double altura = entrada.nextDouble();
			if(peso > 90 && altura < 1.50) {
				quant_acima_90++;
			}else if (idade > 10 && idade < 30 && altura > 1.90) {
				quant_porcent_pessoa++;
			}
			soma = soma + idade;
		}
		media = soma / 10;
		porcent_de_pessoas = (quant_porcent_pessoa * 10) / 100;
		System.out.printf("A média das idades das dez pessoas é: %d anos \n", media);
		System.out.printf("A quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50 m é: %d pessoas \n",  quant_acima_90);
		System.out.printf("A percentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m é: %.1f% \n", porcent_de_pessoas);
		entrada.close();
	}

}
