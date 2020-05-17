package fundamentos;

public class TiporPrimitivos {
	
	public static void main(String[] args) {
		// Funcionaiso
		
		// Tipos Numericos 
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 58789;
		long pontosAcumulados = 3_134_845_223L; //Caso poassar o numeros de tamanho sempre colocar  o "L" no final
		//long pontosAcumulados = 3_134_845_223L; 
		
		//tipos numnericos reais
		
		float salario = 11_445.44F; // F para mostrar que sera em Float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		
		boolean estaDeFerias = false;
		
		//Tipo caractere
		
		char status = 'A'; //Ativo, uma letra apenas, pode usar o unicode \u0010
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de Viagens
		System.out.println(numerosDeVoos / 2);
		
		//Pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Funbcionario
		System.out.println(id + ": Ganha: R$" + salario);
		
		// Ferias
		System.out.println("Está de Férias?: " + estaDeFerias);
		
		//Status
		System.out.println("Status: " + status);
		
				
	}

}
