package lacoscondicionais;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner escrever = new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Digite a nota da P1: ");
		nota1 = escrever.nextFloat();
		
		System.out.println("Digite a nota da P2: ");
		nota2 = escrever.nextFloat();
		
		//CALCULO DA MEDIA
		
		media = (nota1 + nota2)/2;
		
		
		if(media >= 5) {
		
		 System.out.println("Parabéns, você foi aprovado! Sua nota final é: " +media);
		} else {
			 System.out.println("REPROVADO, ESTUDE MAIS!Sua nota final é: "+media);
		}
		
		escrever.close();
	}

}
