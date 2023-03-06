package testes;
import java.util.Scanner;

public class media_next {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("- Digite o nome completo do aluno: ");
		String nome = input.nextLine();
		System.out.println("- Informe a nota da primeira unidade desse aluno: ");
		double aluno_nota1 = input.nextDouble();
		System.out.println("- Informe a nota da segunda unidade desse aluno: ");
		double aluno_nota2 = input.nextDouble();
		double media = 0;
		
		media = (aluno_nota1 + aluno_nota2) / 2;
		System.out.println();
		System.out.println("-------------Status do aluno-------------");
		System.out.println();
		if(media >= 7) { 
			System.out.println("- " + nome);
			System.out.println("- Média: " + media);
			System.out.println("APROVADO!");
		}
		else if(media >= 4 & media <= 6.9) {
			
			System.out.println("- " + nome);
			System.out.println("- Média: " + media);
			System.out.println("AVALIAÇÃO FINAL!");
		}
		else { 
			System.out.println("- " + nome);
			System.out.println("- Média: " + media);
			System.out.println("REPROVADO!");
		}
		
		

	}

}
