package javaNaVeia;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome = "Gustavo Henrique";
		int idade = 26;
		float altura = (float) 1.70;

		System.out.println("\n\tMeu nome é: "+nome);
		System.out.println("\n\tEu tenho: "+idade+" anos de vida");
		System.out.println("\n\tEu tenho: "+altura+" metros de altura.");
		
		System.out.println("\nEntre com o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nEntre com a sua altura: ");
		altura = leia.nextFloat();
		
		System.out.println("\n\tMeu nome é: "+nome);
		System.out.println("\n\tEu tenho: "+idade+" anos de vida");
		System.out.println("\n\tEu tenho: "+altura+" metros de altura.");
		
		leia.close();
	}

}
