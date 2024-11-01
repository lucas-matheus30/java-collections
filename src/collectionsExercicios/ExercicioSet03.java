package collectionsExercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet03 {
	public static void main(String[] args) {

		Set<Integer> setInteiros = new HashSet<>();

		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite 10 números inteiros e não repetidos: ");
			setInteiros.add(leia.nextInt());
		}
		System.out.println("\nListando todos os elementos: ");
		System.out.println(setInteiros);

		System.out.println("\nListando os elementos com o Iterator: ");

		Iterator<Integer> isetInteiros = setInteiros.iterator();

		while (isetInteiros.hasNext()) {
			System.out.println(isetInteiros.next());
		}

		leia.close();
	}

}
