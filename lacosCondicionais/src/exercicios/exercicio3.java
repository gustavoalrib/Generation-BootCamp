package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação? ");
		primeiraDoacao = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69 && primeiraDoacao == true) {
				System.out.println(nome + " está apto para doar sangue.");
			} else if (idade >= 18 && idade < 60) {
				System.out.println(nome + " está apto para doar sangue.");
			} else {
				System.out.println(nome + " não está apto para doar sangue.");
			}
		} else {
			System.out.println(nome + " não está apto para doar sangue.");
		}
		
		
		leia.close();
	}

}
