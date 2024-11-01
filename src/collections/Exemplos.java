package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exemplos {
	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		
		System.out.println("Notas cadastradas: " + notas);
		System.out.println("O índice da nota 5 é: " + notas.indexOf(5.0));
		System.out.println("A nota 5 existe na lista? " + notas.contains(5.0));
		System.out.println("Tamanho: " + notas.size());
		notas.set(notas.indexOf(5.0),6.0);
		System.out.println(notas);
		
		for (Double nota : notas) {
			System.out.println(nota);
		}
		
		Iterator<Double> iNotas = notas.iterator();
		
		while(iNotas.hasNext()) {
			System.out.println(iNotas.next());
			
			
			Set<String> setFrutas = new HashSet<String>();
			
			setFrutas.add("Abacate");
			setFrutas.add("Banana");
			setFrutas.add("Jabuticaba");
			setFrutas.add("Kiwi");
			setFrutas.add("Maça");
			setFrutas.add("Morango");
			setFrutas.add("Pêra");
			setFrutas.add("Jaboticaba");
			setFrutas.add("Kiwi");
			setFrutas.add("Abacate");
			
			System.out.println(setFrutas);
			
			
		}
	}

}
