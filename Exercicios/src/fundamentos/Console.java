package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
/**%s = String
%d = Inteiro
%f = número com ponto flutuante. Na verdade o "f" representa a vírgula.
\t = tabulação
\n = salto de linha/**/
		
		int numero = 4;
		
		System.out.printf("Megasena: %d %.2f\n", numero, 441.412);
		System.out.printf("Nome: %s", "Bruno\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = input.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
				
		System.out.printf("%s %s tem %d anos.", nome.toUpperCase(), sobrenome, idade);
		
		input.close();
		
	}

}
