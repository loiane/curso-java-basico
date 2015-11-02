
public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		if (pessoa instanceof Pessoa){
			System.out.println("Objeto do tipo Pessoa");
		}
		
		if (aluno instanceof Aluno){
			System.out.println("Objeto do tipo Aluno");
		}
		
		if (professor instanceof Professor){
			System.out.println("Objeto do tipo Professor");
		}
	}
	
	public static String obterString(){
		return "minha String";
	}
	
	public static int obterInteiro(){
		return 1;
	}
}
