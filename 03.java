package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		int peso1, peso2, peso3;
		
		System.out.print("Digite a 1ª nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite o peso da 1ª nota: ");
		peso1 = sc.nextInt();
		System.out.print("Digite a 2ª nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite o peso da 2ª nota: ");
		peso2 = sc.nextInt();
		System.out.print("Digite a 3ª nota: ");
		nota3 = sc.nextDouble();
		System.out.print("Digite o peso da 3ª nota: ");
		peso3 = sc.nextInt();
		
		media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
		
		System.out.print("A média ponderada é: " + media);
	
	}

}
