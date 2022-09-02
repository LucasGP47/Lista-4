import java.util.Scanner;

public class ex7 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [] num = new int [5];
		int x = 0, soma = 0, mult = 1;
		
		
		for (x = 0; x < 5; x++) {
			System.out.print("Informe os numeros desejados: ");
			num[x] = entrada.nextInt();
			if (x > 1000000000) {
				entrada.close();
			}
		}
		
		System.out.println("Os numeros do vetor sao: ");
		
	    for (x = 0; x < 5; x++) {
	    	soma = num[x] + soma;
	    	mult = mult * num[x];
	    	System.out.print(num[x] + "; ");
	    }
	    System.out.println("");
	    System.out.println("A soma e: ");
	    System.out.println(soma + ";");
		System.out.println("A multiplicacao e: ");
		System.out.println(mult + ";");
}
}
