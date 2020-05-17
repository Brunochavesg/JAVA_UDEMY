package fundamentos;

public class NotaçãoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora!"); //replace, substituir uma palavra
		s = s.toUpperCase(); // toUpperCase, deixar tudo maiusculo
		s = s.concat("!!!");// concatenar
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();// pode colocar na frente o metodo  tambem
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");// Da para colocar mais metodos em 1 linha, enter depois doi " . " pode deixar para baixo
		System.out.println(y);
		
		// Tipos primitivos nao tem o operador "."
	}

}
