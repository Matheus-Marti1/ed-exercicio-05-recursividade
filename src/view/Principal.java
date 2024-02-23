package view;

import java.util.Scanner;

import controller.SomatoriaController;

public class Principal {

	public static void main(String[] args) {
		SomatoriaController somatoriaController = new SomatoriaController();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número inteiro para calcular a somatória S = 1 + 1/2 + ... + 1/N: ");
		int n = entrada.nextInt();
		System.out.println("Resultado da somatória: " + somatoriaController.somatoria(n));
		entrada.close();
	}
}
