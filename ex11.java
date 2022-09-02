import java.util.Scanner; 

public class ex11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numero de palavras na frase: ");
		
		int t = entrada.nextInt();
		
		String[] palavras = new String[t];
		
		for (int x = 0; x < t; x++ ) {
             			
		System.out.println("Informe a palavra: ");
		
			palavras[x] = entrada.next();
			
		}
		
		for (int x = 0; x < t; x++ ) {
			System.out.print(palavras[x] + ";");
			entrada.close();
		}

	}

}
