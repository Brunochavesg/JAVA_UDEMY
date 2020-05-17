package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Mundo!".charAt(4));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); // da para fazer das 2 forma
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));// startsWith - se contem a palavra na frase
		System.out.println(s.endsWith("Casa"));
		System.out.println(s.length()); // ver o tamanho do texto, 
		System.out.println(s.equals("boa tarde"));  
		System.out.println(s.equalsIgnoreCase("boa tarde"));  
		
		var nome = "Bruno";
		var sobrenome = "Chaves";
		var idade = 35;
		var salario= 3.000;
		
		System.out.printf("O Senhor %s %s, com idade de %s anos, ganha R$%.3f Reais.\n", nome, sobrenome, idade, salario); //%. Igualo "f" do python
		String frase = String.format("O Senhor %s %s, com idade de %s anos, ganha R$%.3f Reais.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Testando os Strings".isBlank());
		System.out.println(" ".isBlank());
		
			
	}

}
