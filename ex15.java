import java.util.Scanner; 

public class ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor");
	    
		int tamanho = entrada.nextInt();
		
		int[] vet = new int[tamanho];
        
		for (int x = 0; x < tamanho; x++) {
			System.out.println("Informe o valor " + (x+1));
			vet[x] = entrada.nextInt();
		}
		
		for (int x = 0; x < tamanho; x++) {
			
			if (vet[x] >= 0 &&  vet[x] <= 20) {
				
				System.out.print(vet[x] + ".");
				
				for (int y = 0; y < vet[x]; y++)
					
					System.out.print("#");
				
			}
			System.out.println("");
			entrada.close();
		}
		
		
		
	}

}
