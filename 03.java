package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double sal, perc, aumento, novosal;
			
			System.out.print("Digite o salário: ");
			sal = sc.nextDouble();
			System.out.print("Digite o percentual de aumento (%): ");
			perc = sc.nextDouble();
			
			aumento = sal * perc/100;
			
			System.out.println("Valor do aumento: R$ " + aumento);
			
			novosal = sal + aumento;
			
			System.out.print("O novo salário é: R$ " + novosal);

			}

	}
