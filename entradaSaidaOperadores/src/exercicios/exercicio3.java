package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor das horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Salário líquido: R$ " + salarioLiquido);
		
		leia.close();

	}

}
