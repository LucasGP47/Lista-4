import java.util.Scanner;

public class ex1 {

	public static void main (String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		int x =0;
		
		int [] vet = new int [5];
		
		System.out.println("Informe os numeros do vetor: ");
	    
		for (x = 0; x < 5; x++) {
			vet [x] = entrada.nextInt();
			System.out.println("Numero: " + vet [x]);
			
			
			
			if (x > 1000000000) {
				entrada.close();
			}
		}
		
		
		entrada.close();
	    
}
}