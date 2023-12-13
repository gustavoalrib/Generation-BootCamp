package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioCollectionList1 {

	public static void main(String[] args) {
		
		List<String> cores = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			cores.add(leia.nextLine());
		}
		
		System.out.println("Listar todas as cores: ");
		
		for (int i = 0; i < cores.size(); i ++) {
			System.out.println(cores.get(i));
		}
		
		
		System.out.println("Ordenar as cores: ");
		
		Collections.sort(cores);
		System.out.println(cores);
	}

}