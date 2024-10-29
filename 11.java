package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, r2, r3;
		
		System.out.print("Digite um número positivo e maior que 0: ");
		num = sc.nextInt();
		
		quad = Math.pow(num,2);
		cubo = Math.pow(num,3);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		
		System.out.println("O quadrado do número é: " + quad);
        System.out.println("O cubo do número é: " + cubo);
        System.out.println("A raiz quadrada do número é: " + r2);
        System.out.println("A raiz cúbica do número é: " + r3);
	}

}
