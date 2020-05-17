package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // declarada a variave e ja iniciada
		System.out.println(a);
		
		var b = 4.5; //var, represtenta que ele escolhe qual o tipo primitivo
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		double d; //variavel foi declarada
		d = 123.54; // variavel foi iniciada
		System.out.println(d);// variavel foi usada
		
	}

}
