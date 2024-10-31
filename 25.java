package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custo, convite, qtd;
		
		System.out.print("Digite o custo do espetáculo: ");
	    custo = sc.nextDouble();
	    System.out.print("Digite o preço do convite: ");
        convite = sc.nextDouble();
        
        qtd = custo / convite;
        qtd = Math.ceil(qtd);
        
        System.out.print("Quantidade de convites a serem vendidos: " + qtd);

	}

}
