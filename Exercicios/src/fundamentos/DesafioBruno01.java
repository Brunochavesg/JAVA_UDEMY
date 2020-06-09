package fundamentos;

import java.util.Scanner;

public class DesafioBruno01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nome;
		byte idade;
		double salario, meses;
		String palavra, replace;

		System.out.println("***Bem Vindo!***");
		System.out.println("Digite seu Nome: ");
		nome = input.next();
		System.out.println("Bem vindo Sr(s): " + nome + "\nNo seu nome contêm: " + nome.length() + " Letras");

		System.out.println("Qual a sua Idade?: ");
		idade = input.nextByte();
		if (idade >= 18) {
			System.out.println("Você é MAIOR de idade");
		} else {
			System.out.println("Você é MENOR de idade");
		}

		System.out.println("Qual o seu Salário Atualmente?: ");
		salario = input.nextDouble();

		System.out.printf("Quantos meses você trabalhou com o salário de R$%.4s Reais.", salario);
		meses = input.nextDouble();

		System.out.println("Você recebeu o total de:\n" + salario * meses + " ");

		System.out.println("Escreva uma palavra qualquer: ");
		palavra = input.next();
		System.out.printf("Sua palavra em Maiusculo é %s:", palavra.toUpperCase());

	}

}
