package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha1 {

	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("---------------- MENU ----------------");
			System.out.println("\n1 - Adicionar um novo livro na pilha.");
			System.out.println("2 - Listar todos os livros da pilha.");
			System.out.println("3 - Retirar livro da pilha.");
			System.out.println("0 - Sair");
			System.out.println("\nEntre com a opção desejada:");

			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome do livro:");
				livros.push(leia.nextLine());
				System.out.println("Livro adicionado.");
				break;
			case 2:
				System.out.println("Lista de livros na pilha:");
				System.out.println(livros);
				break;
			case 3:
				if (livros.size() == 0) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("O livro " + livros.pop() + " foi retirado da pilha.");
				}
			default:
				System.out.println("Programa finalizado.");
				break;
			}

		} while (opcao != 0);

	}

}

