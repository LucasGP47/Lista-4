import java.util.Scanner; 

public class ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int y = -1, aux = 0;
		int[] vet1 = new int [10];
		int[] vet2= new int [20];
		int[] vet3 = new int [20];
		
		for (int x = 0; x < 10; x++) {
			System.out.println("Informe os valores do vetor 1: ");
			vet1[x] = entrada.nextInt();
		    
		    y = y + 1;
		    vet3[y] = vet1[x];
		    
}
		y = 9;
		for (int x = 0; x < 10; x++) {
			System.out.println("Informe os valores do vetor 2: ");
			vet2[x] = entrada.nextInt();
			y = y + 1;
			vet3[y] = vet2[x];
		}
		
		
		
        System.out.println("O vetor 3 e: ");
        
        aux = 0;
        for (aux = 0; aux < 20; aux++) {
		System.out.println(vet3[aux] + "; ");
		entrada.close();
        }

	}

}
