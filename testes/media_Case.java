package testes;

public class media_Case {

	public static void main(String[] args) {
		int aluno_nota1 = 5;
		int aluno_nota2 = 5;
		int media = 0;
		
		media = (aluno_nota1 + aluno_nota2) / 2;
		System.out.println("M�dia do aluno: " + media);
		
		switch (media) {
		case 0: 
			System.out.println("Reprovado");
			break;
		
		case 1: 
			System.out.println("Reprovado");
			break;
			
		case 2: 
			System.out.println("Reprovado");
			break;
			
		case 3: 
			System.out.println("Reprovado");
			break;
			
		case 4: 
			System.out.println("Recupera��o");
			break;
			
		case 5: 
			System.out.println("Recupera��o");
			break;
			
		case 6: 
			System.out.println("Recupera��o");
			break;
			
		case 7: 
			System.out.println("Aprovado");
			break;
			
		case 8: 
			System.out.println("Aprovado");
			break;
			
		case 9: 
			System.out.println("Aprovado");
			break;
			
		case 10: 
			System.out.println("Aprovado");
			break;
			
		default: 
			System.out.println("Nenhuma m�dia corresponde a esse valor");
			break;
		
	
		}

	}

}
