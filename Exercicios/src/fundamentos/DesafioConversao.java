package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual foi seu último salário? ");
		String val1 = input.next().replace(",", ".");
		System.out.print("Qual foi seu penúltimo salário? ");
		String val2 = input.next().replace(",", ".");
		System.out.print("Qual foi seu antepenúltimo salário? ");
		String val3 = input.next().replace(",", ".");
		
		double sal1 = Double.parseDouble(val1);
		double sal2 = Double.parseDouble(val2);
		double sal3 = Double.parseDouble(val3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("A Média dos salários é %s", media);
		
		
		input.close();
	}
	
}
