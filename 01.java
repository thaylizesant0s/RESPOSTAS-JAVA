package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4, soma;
		
		System.out.print("Digite o 1° número: ");
		n1 = sc.nextInt();
		System.out.print("Digite o 2° número: ");
		n2 = sc.nextInt();
		System.out.print("Digite o 3° número: ");
		n3 = sc.nextInt();
		System.out.print("Digite o 4° número: ");
		n4 = sc.nextInt();
		
		soma = n1 + n2 + n3 + n4;
		
		System.out.print("A soma dos números é: " + soma);
	
	}

}
