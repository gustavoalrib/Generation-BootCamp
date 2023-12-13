package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
	int a, b, c, soma;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite um valor inteiro para A: ");
	a = leia.nextInt();
	
	System.out.println("Digite um valor inteiro para B: ");
	b = leia.nextInt();
	
	System.out.println("Digite um valor inteiro para C: ");
	c = leia.nextInt();
	
	soma = a + b;
	
	if (soma > c) {
		System.out.println("A soma de A + B é maior que C");
	} else if (soma < c) {
		System.out.println("A soma de A + B é menor que C");
	} else {
		System.out.println("A soma de A + B é igual a C");
	}

	leia.close();
	}

}
