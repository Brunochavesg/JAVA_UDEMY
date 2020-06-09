package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; // Convers�o implicita
		System.out.println(a);
		
		float b = 1.0F; // para tornar o literal em float, colocar o "F" na frente
		System.out.println(b);
		
		float bb = (float) 1.448474; // Convers�o explicita (Chama-se CAST)
		System.out.println(bb);
		
		int c = 4;
		byte d = (byte) c; // Convers�o explicita (Chama-se CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // Convers�o explicita (Chama-se CAST)
		System.out.println(f);
		
	}

}
