package fundamentos;

import java.util.Scanner;

public class DesafioBruno01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		byte idade;
		double salario;
		double meses;
		String palavra;
		
		
				
		System.out.println("***Bem Vindo!***");
		System.out.print("Digite seu Nome!: ");
		nome = input.next();
		System.out.println("Bem vindo Sr(s): " + nome);
		System.out.print("Qual a sua Idade?: ");
		idade = input.nextByte();
		System.out.print("Qual o seu Sal�rio Atualmente?: ");
		salario = input.nextDouble();
		System.out.print("Quantos meses voc� trabalhou com o sal�rio de " + salario + "?");
		meses = input.nextDouble();
		System.out.print("Voc� recebeu o total de: " + salario * meses);
		System.out.println("Escreva uma palavra qualquer: ");
		palavra = input.next();
		
		
		
		
				
	}

}
