package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O novo salário é: R$ " + novoSalario);
		
		leia.close();

	}

}
