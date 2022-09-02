import java.util.Scanner;

public class ex3 {
	public static void main (String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float [] vet = new float [4];
		
		float soma = 0;
		int x = 0;
		float media = 0;
		
		System.out.println("Informe as notas: ");
		
		for (x = 0; x < 4; x++ ) {
			
			vet[x] = entrada.nextFloat();
			soma = vet[x] + soma;
			media = soma / 4;
			
			if (x > 1000000000) {
				entrada.close();
			}
		}
		
		System.out.println("A media foi: "+ media);
		
		
		
		
		
	}
}
