package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de n1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o valor de n2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o valor de n3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o valor de n4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: " + diferenca);
		
		leia.close();

	}

}
