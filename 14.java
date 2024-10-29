package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano_atual, ano_nascimento, idade_atual, idade_2050;
		
		System.out.print("Digite o ano atual: ");
		ano_atual = sc.nextInt();
		System.out.print("Digite o ano de nascimento: ");
		ano_nascimento = sc.nextInt();
		
		idade_atual = ano_atual - ano_nascimento;
		idade_2050 = 2050 - ano_nascimento;
		
		System.out.println("A idade atual é: " + idade_atual);
        System.out.println("A idade em 2050 será: " + idade_2050);
	}

}
