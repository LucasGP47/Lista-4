import java.util.Scanner;

public class ex5 {
	public static void main (String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		int p = 0, i = 0, x =0;
		
		int [] vet = new int [20];
		
		int [] par = new int [20];
		
		int [] impar = new int [20];
		
		for (x = 0; x < 20; x++) {
			System.out.print("Informe o numero " + (x + 1) + ": ");
			vet[x] = entrada.nextInt();
			
			if (vet [x] % 2 ==0) {
				par[p] = vet[x];
				p = p+1;
			}
				else {
					impar[i] = vet[x];
					i = i+1;
			}
			if (x > 1000000000) {
				entrada.close();
		}
		}
		System.out.println("Vetor total: ");
		
		for (x = 0; x < 20; x++) {
			System.out.print(vet[x] + "; ");
		}
		System.out.println("");
		System.out.println("Vetor impar: ");
		
		for (x = 0; x <= (i - 1); x++) {
			System.out.print(impar[x] + "; ");
		}
		System.out.println("");
		System.out.println("Vetor par: ");
		
		for (x = 0; x <= (p - 1); x++) {
			System.out.print(par[x] + "; ");
		}
	
	}
}

