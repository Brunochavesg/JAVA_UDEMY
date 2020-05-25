package fundamentos;

import java.util.Scanner;

public class DesafioBruno01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		byte idade;
		double salario, meses;
		String palavra;
		
		
				
		System.out.println("***Bem Vindo!***");
		System.out.println("Digite seu Nome: ");
		nome = input.next();
		System.out.println("Bem vindo Sr(s): " + nome);
		
		System.out.println("Qual a sua Idade?: ");
		idade = input.nextByte();
		
		System.out.println("Qual o seu Salário Atualmente?: ");
		salario = input.nextDouble();
		
		System.out.printf("Quantos meses você trabalhou com o salário de R$%.4s Reais.", salario);
		meses = input.nextDouble();
		
		System.out.println("Você recebeu o total de:\n " + salario * meses + " ");
		
		System.out.println("Escreva uma palavra qualquer: ");
		palavra = input.next();
		System.out.println("Sua palavra em Maiusculo!:" + palavra.toUpperCase());
		
		
				
	}

}
