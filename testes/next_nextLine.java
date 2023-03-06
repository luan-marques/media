package testes;
import java.util.Scanner; //import do Scanner

/* métodos: next();
 *          nextLine();
 *          nextInt();
 *          nextDouble();
 *          nextLong();
 *          nextFloat();
 */

public class next_nextLine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //objeto da classe Scanner	
		System.out.print("Digite seu nome completo: ");
		String nome = input.nextLine(); //método nextLine
		System.out.println("- " + nome);
		System.out.println();
		System.out.println("Digite seu CPF: ");
		int cpf = input.nextInt(); //método nextInt
		System.out.println("- " + cpf);
		
	
		
	}

}
