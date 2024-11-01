package collectionsExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArray02 {
	public static void main(String[] args) {

		ArrayList<Integer> numerosInteiros = new ArrayList<>();

		numerosInteiros.add(2);
		numerosInteiros.add(5);
		numerosInteiros.add(1);
		numerosInteiros.add(3);
		numerosInteiros.add(4);
		numerosInteiros.add(9);
		numerosInteiros.add(7);
		numerosInteiros.add(8);
		numerosInteiros.add(10);
		numerosInteiros.add(6);

		System.out.println("ArrayList: ");
		System.out.println(numerosInteiros);

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número inteiro para encontrar a posição dele: ");
		int numeroDesejado = leia.nextInt();

		if (numerosInteiros.indexOf(numeroDesejado) != -1) {
			System.out.println("O número escolhido: " + numeroDesejado + ", está na posição "
					+ numerosInteiros.indexOf(numeroDesejado) + ".");
		} else {
			System.out.println("O número " + numeroDesejado + ", não foi encontrado!");
		}

		leia.close();

	}

}
