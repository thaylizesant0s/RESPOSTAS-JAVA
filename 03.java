package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, mp;
		int p1, p2, p3;
		
		System.out.print("Digite a 1ª nota: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o peso da 1ª nota: ");
		p1 = sc.nextInt();
		System.out.print("Digite a 2ª nota: ");
		n2 = sc.nextDouble();
		System.out.print("Digite o peso da 2ª nota: ");
		p2 = sc.nextInt();
		System.out.print("Digite a 3ª nota: ");
		n3 = sc.nextDouble();
		System.out.print("Digite o peso da 3ª nota: ");
		p3 = sc.nextInt();
		
		sc.close();
		
		mp = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);
		
		System.out.print("A média ponderada é: " + mp);
	
	}

}
