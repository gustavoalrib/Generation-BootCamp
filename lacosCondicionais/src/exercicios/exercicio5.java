package exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
	
	int produto, quantidade;
	float valorTotal;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Produtos:");
	System.out.println("1 - Cachorro quente");
	System.out.println("2 - X-Salada");
	System.out.println("3 - X-Bacon");
	System.out.println("4 - Bauru");
	System.out.println("5 - Refrigerante");
	System.out.println("6 - Suco de laranja");
	
	System.out.println("\nInforme o número do produto desejado: ");
	produto = leia.nextInt();
	
	System.out.println("\nInforme a quantidade desejada: ");
	quantidade = leia.nextInt();
	
	switch (produto) {
	
	case 1:
		valorTotal = 10 * quantidade;
		System.out.println("Produto: Cachorro quente" + "\nValor total: R$ " + valorTotal);
		break;
	
	case 2:
		valorTotal = 15 * quantidade;
		System.out.println("Produto: X-Salada" + "\nValor total: R$ " + valorTotal);
		break;
		
	case 3:
		valorTotal = 18 * quantidade;
		System.out.println("Produto: X-Bacon" + "\nValor total: R$ " + valorTotal);
		break;
		
	case 4:
		valorTotal = 12 * quantidade;
		System.out.println("Produto: Bauru" + "\nValor total: R$ " + valorTotal);
		break;
		
	case 5:
		valorTotal = 8 * quantidade;
		System.out.println("Produto: Refrigerante" + "\nValor total: R$ " + valorTotal);
		break;
		
	case 6:
		valorTotal = 13 * quantidade;
		System.out.println("Produto: Suco de laranja" + "\nValor total: R$ " + valorTotal);
		break;
	
	default:
		System.out.println("Você digitou uma opção inválida.");
	}
		
	
	leia.close();
	}

}
