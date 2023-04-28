package Exercicioempresa;

import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int ataque;
        int defesa;
        int evolucao;
        
        System.out.println("Informe um valor entre 0 e 10:");
        System.out.println("======================================================");
        
        do {
        System.out.print("Digite o nível de ATAQUE do personagem (entre 0 e 10): ");
        ataque = ler.nextInt();
        System.out.println("======================================================");
        }while(!(ataque >= 0 && ataque <= 10));

        do {
        System.out.print("Digite o nível de DEFESA do personagem (entre 0 e 10): ");
        defesa = ler.nextInt();
        System.out.println("======================================================");
        }while(!(defesa >= 0 && defesa <= 10));

        do {
        System.out.print("Digite a capacidade de EVOLUÇÃO do personagem (entre 0 e 10): ");
        evolucao = ler.nextInt();
        System.out.println("======================================================");
        }while(!(evolucao >= 0 && evolucao <= 10));
        
        if (ataque >= 0 && ataque <= 10 && defesa >= 0 && defesa <= 10 && evolucao >= 0 && evolucao <= 10) {
        	double poder = (ataque * 0.45) + (defesa * 0.35) + (evolucao * 0.2);
            System.out.printf("O poder do personagem é %.2f\n", poder);

            if (poder >= 8.0) {
                System.out.println("Personagem especial");
            }else {
            	System.out.println("Personagem normal");
            }
        }

        ler.close();
    }

}