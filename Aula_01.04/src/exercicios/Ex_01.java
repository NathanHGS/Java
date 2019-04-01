package exercicios;

import java.util.ArrayList;

public class Ex_01 {
	public static void main(String[] args) {
		ArrayList<Integer> multiplos = new ArrayList<>();
		for(int i = 1; i <= 150; i++) {
			if(i % 3 == 0) {
				multiplos.add(i);
			}
		}
		System.out.println(multiplos);
	}	
}
