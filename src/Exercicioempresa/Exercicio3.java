package Exercicioempresa;

import java.util.Scanner;

public class Exercicio3{
	
	public static void main(String[] args) {	
		
		String nome;
		int idade;
		double altura,peso,conta;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o Nome: ");
		nome = ler.next();
		System.out.print("Informe a Idade: ");
		idade = ler.nextInt();
		System.out.print("Informe a Altura: ");
		altura = ler.nextDouble();
		System.out.print("Informe o Peso: ");
		peso = ler.nextDouble();
		
		ler.close();
		
		conta = IMC(peso, altura);
		System.out.println("-----------------------");
		System.out.println("Nome da pessoa: " + nome);
		System.out.println("Idade da pessoa: " + idade);
		System.out.printf("Altura da pessoa: %.2f \n", altura);
		System.out.printf("Peso da pessoa: %.2f \n", peso);
		System.out.printf("IMC da pessoa: %.2f (%s)", conta, TabelaIMC(conta));
		
	}
		public static double IMC(double peso, double altura) {
			return (peso / (altura * altura));
		}
		
		public static String TabelaIMC(double conta) {
			if(conta < 18.5) {
				return("Abaixo do peso");
			}else if(conta > 18.5 && conta <= 24.9) {
				return("Peso normal");
			}else if(conta > 25.0 && conta <= 29.9) {
				return("Excesso de peso");
			}else if(conta > 30.0 && conta <= 34.9) {
				return("Obesidade classe 1");
			}else if(conta > 35.0 && conta <= 39.9) {
				return("Obesidade classe 2");
			}else{
				return("Obesidade classe 3");
			}
			
		}
		
}