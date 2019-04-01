package aula;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(2, 4);
		lista.add(4, 10);
		System.out.println(lista);
		System.out.println(lista.size());
		lista.set(2, 55);
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
		System.out.println(lista.get(3));
		ArrayList<String> listaString = new ArrayList<>();
		listaString.add("Nathan");
		System.out.println(listaString);
		listaString.remove("Nathan");
		System.out.println(listaString);
	}
}
