package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila1 {

	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("---------------- MENU ----------------");
			System.out.println("\n1 - Adicionar um novo cliente na fila.");
			System.out.println("2 - Listar todos os clientes na fila.");
			System.out.println("3 - Retirar cliente da fila.");
			System.out.println("0 - Sair");
			System.out.println("\nEntre com a opção desejada:");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome do cliente: ");
				clientes.add(leia.nextLine());
				System.out.println("Cliente adicionado.");
				break;
			case 2:
				System.out.println("Clientes:");
				System.out.println(clientes);
				break;
			case 3:
				if (clientes.size() == 0) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("O cliente " + clientes.remove() + " foi chamado.");
				}
				break;
			default:
				System.out.println("Programa finalizado.");
				break;
			}

		} while (opcao != 0);

	}

}