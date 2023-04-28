package Exercicioempresa;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int num = 0, soma = 0;
		
		for(int i = 1;num>=0;i++) {
				System.out.print("Digite o "+i+"° numero: ");
				num = leitura.nextInt();
				if(num >= 0) {
				soma += num;
				System.out.println("Somando: " + soma);
			}
		}
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("Não e Permitido Numero Negativo");
		System.out.println("");
		System.out.println("Resultado: " + soma);
		System.out.println("----------------------------------");
		leitura.close();
	}
}
