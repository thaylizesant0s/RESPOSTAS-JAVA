package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso_saco, racao_gato1, racao_gato2, total_final;
		
		System.out.print("Digite o peso do saco de ração (kg): ");
        peso_saco = sc.nextDouble();
        System.out.print("Digite a ração diária para o primeiro gato (g): ");
        racao_gato1 = sc.nextDouble();
        System.out.print("Digite a ração diária para o segundo gato (g): ");
        racao_gato2 = sc.nextDouble();
        
        racao_gato1 = racao_gato1 / 1000;
        racao_gato2 = racao_gato2 / 1000;
        total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
        
        System.out.print("Após cinco dias, restará: " + total_final + "kg de ração.");
        
	}

}
