import java.util.Scanner;

public class ex2 {

	public static void main (String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		int x =0;
		
		int [] vet = new int [10];
		
		System.out.println("Informe os numeros do vetor: ");
	    
		for (x = 0; x < 10; x++) {
			
			vet [x] = entrada.nextInt();
			
			if (x > 1000000000) {
				entrada.close();
			}

		}
		
		for (x = vet.length - 1; x >= 0; x-- ) {
			
			System.out.println("Numero: " + vet [x]);
		
		entrada.close();
		}	    
}
}