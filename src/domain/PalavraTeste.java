package domain;

import java.util.Arrays;
import java.util.Scanner;

public class PalavraTeste {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra = "arara";
		String palavraEmbaralhada = "arraa";
		
		final String[] palavraLista = palavra.split("");
		Arrays.sort(palavraLista);
		
		final String[] palavraEmbaralhadaLista = palavraEmbaralhada.split("");
		Arrays.sort(palavraEmbaralhadaLista);
		
		System.out.println(Arrays.deepEquals(palavraLista, palavraEmbaralhadaLista));
		
		sc.close();
	}
}
