package collectionsExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArray01 {
	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "º cor: ");
			cores.add(leia.nextLine());
		}

		System.out.println("Cores adicionadas a lista:");
		System.out.println(cores);

		cores.sort(null);
		System.out.println("Cores ordenadas: ");
		System.out.println(cores);
		leia.close();
	}

}
