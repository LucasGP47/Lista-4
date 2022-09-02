import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o texto: ");
		
		String t = entrada.next();
		
		int quantidade;
		
		quantidade = t.length();
		
		char vet[] = new char[quantidade];
		
		for (int x = 0; x < quantidade; x++) {
			
			vet[x] = t.charAt(x);
			
		}
		
		System.out.println("");
		System.out.println("O vetor das palavras e: ");
		
		for (int x = 0; x < quantidade; x++) {
			
			System.out.print(vet[x] + "; ");
			
		}
entrada.close();
	}

}
