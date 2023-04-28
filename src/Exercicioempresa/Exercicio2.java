package Exercicioempresa;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int eleitores, validos, brancos, nulos;
		double conta1, conta2, conta3;
		
		System.out.print("Numero de eleitores: ");
		eleitores = ler.nextInt();
		System.out.print("Numero de validos: ");
		validos = ler.nextInt();
		System.out.print("Numero de brancos: ");
		brancos = ler.nextInt();
		System.out.print("Numero de nulos: ");
		nulos = ler.nextInt();
		
		conta1 = ((double)validos * 100) / eleitores;
		conta2 = ((double)brancos * 100) / eleitores;
		conta3 = ((double)nulos * 100) / eleitores;
		
		if(validos > eleitores) {
			System.out.println("");
			System.out.println("Mais votos que que eleitores");
		}else if(brancos > eleitores) {
			System.out.println("");
			System.out.println("Mais votos que que eleitores");
		}else if(nulos > eleitores){
			System.out.println("");
			System.out.println("Mais votos que que eleitores");
		}else {
			System.out.printf("\n \n%.0f%% de votos Validos.", conta1);
			System.out.printf("\n \n%.0f%% de votos Brancos.", conta2);
			System.out.printf("\n \n%.0f%% de votos Nulos.", conta3);
		}
		ler.close();
		
	}
}
