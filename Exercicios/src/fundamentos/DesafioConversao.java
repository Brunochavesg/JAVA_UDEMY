package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual foi seu �ltimo sal�rio? ");
		String val1 = input.next().replace(",", ".");
		System.out.print("Qual foi seu pen�ltimo sal�rio? ");
		String val2 = input.next().replace(",", ".");
		System.out.print("Qual foi seu antepen�ltimo sal�rio? ");
		String val3 = input.next().replace(",", ".");
		
		double sal1 = Double.parseDouble(val1);
		double sal2 = Double.parseDouble(val2);
		double sal3 = Double.parseDouble(val3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("A M�dia dos sal�rios � %s", media);
		
		
		input.close();
	}
	
}
