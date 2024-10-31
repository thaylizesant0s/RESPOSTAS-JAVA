package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang, alt, escada, radiano;
		
		System.out.print("Digite o ângulo formado pela escada (°): ");
        ang = sc.nextDouble();
        System.out.print("Digite a altura da parede (em metros): ");
        alt = sc.nextDouble();
        
        radiano = ang * 3.14 / 180;
        escada = alt / Math.sin(radiano);
        
        System.out.printf("A medida da escada é: " + escada + "m.");
        
	}

}
