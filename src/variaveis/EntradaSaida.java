package variaveis;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Entre com a seu nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine().toUpperCase();
		//upper pode colocar no final da concatenação nome
		System.out.println("Sua idade é: "+ idade  + " Seu nome é: "+nome);
		
		
		
	}

}
