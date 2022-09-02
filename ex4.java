import java.util.Scanner; 

public class ex4 {
	public static void main (String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String[] vet = new String [10];
		
		System.out.println("Informe as letras: ");
		
		int x = 0, cons = 10;
		
		for (x = 0; x < 10; x++) {
			
			vet[x] = entrada.next();
			
			if (vet[x].equals("a") || vet[x].equals("e") || vet[x].equals("i") || vet[x].equals("o") || vet[x].equals("u")) {
				
				cons = cons - 1;
				entrada.close();
			}
				
			
		}
		
		System.out.println("Total de consoantes: " + cons);
	}
}
