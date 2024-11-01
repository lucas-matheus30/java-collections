package collectionsExercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet04 {
	public static void main(String[] args) {

		Set<Integer> setInteiros = new HashSet<Integer>();

		setInteiros.add(2);
		setInteiros.add(5);
		setInteiros.add(1);
		setInteiros.add(3);
		setInteiros.add(4);
		setInteiros.add(9);
		setInteiros.add(7);
		setInteiros.add(8);
		setInteiros.add(10);
		setInteiros.add(6);

		System.out.println("Exibindo o set: ");
		System.out.println(setInteiros);

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite um número inteiro para saber se ele está no conjunto: ");
		int numeroDigitado = leia.nextInt();

		if (setInteiros.contains(numeroDigitado) == true) {
			System.out.println("O número : " + numeroDigitado + ", foi encontrado!");
		} else {
			System.out.println("O número : " + numeroDigitado + ", não foi encontrado!");
		}
		leia.close();
	}

}
