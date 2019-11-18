package domain;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	String palavraAoContrario= "";
	
	
		System.out.println("Digite uma palavra para saber se ela � um pal�ndromo: ");
		String palavra = sc.nextLine();
		
		for (int i = (palavra.length() -1); i >= 0; i--) {
			palavraAoContrario = palavraAoContrario + palavra.charAt(i);
        }

		if (palavraAoContrario.toLowerCase().equals(palavra.toLowerCase()) || 
				palavraAoContrario.toLowerCase().length() == palavra.toLowerCase().length()) {
            System.out.println("A palavra inserida � um pal�ndromo!");
        } else {
            System.out.println("A palavra inserida n�o � um pal�ndromo");
        }
	
		
		sc.close();
	}

}
