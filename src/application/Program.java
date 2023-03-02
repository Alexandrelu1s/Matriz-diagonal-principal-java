package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a ordem da matriz: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				System.out.print("Digite um numero: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int negativos = 0;
		
		System.out.print("Diagonal principal: ");
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				if(matriz[i][j] < 0) {
					negativos++;
				}
				if(i == j) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Negativos: " + negativos);
		
		
		sc.close();
	}

}
