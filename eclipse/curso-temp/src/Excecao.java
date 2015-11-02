public class Excecao {

	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		
		try {
			
			System.out.println("Antes da exception");
			
			vetor[5] = 10;
			
			System.out.println("Esse texto não será impresso");
		}
		catch (ArrayIndexOutOfBoundsException exc){
			System.out.println("Erro ao acessar índice que não existe");
		}
		
		System.out.println("Depois do tratamento da exception");
	}
}