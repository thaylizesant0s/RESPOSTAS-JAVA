package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bru, imp, vlr_sal_liq;
		
		System.out.print("Digite o número de horas trabalhadas: ");
		horas_t = sc.nextDouble();
		System.out.print("Digite o valor do salário mínimo: ");
		vlr_sal_min= sc.nextDouble();
		
		vlr_hora_t = vlr_sal_min / 2;
		vlr_sal_bru = vlr_hora_t * horas_t;
		imp = vlr_sal_bru * 3 / 100;
		vlr_sal_liq = vlr_sal_bru - imp;
		
		System.out.print("O salário a receber é: R$ " + vlr_sal_liq);
	}

}
