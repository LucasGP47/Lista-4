import java.util.Scanner;

public class ex14 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] idade = new int [30];
		int[] altura = new int [30];
		
		int mediaalt, somaalt = 0, somaid = 0, aluno = 0;
		
		for (int x = 0; x <30; x++) {
			System.out.println("Informe a idade: ");
			idade[x] = entrada.nextInt();
			somaid = somaid + idade[x];
			
		}
		
		
		for (int x = 0; x <30; x++) {
			System.out.println("Informe a altura: ");
			altura[x] = entrada.nextInt();
			somaalt = somaalt + altura[x];
		}
		
		mediaalt = somaalt / 30;
		
		for (int x = 0; x <30; x++) {
			if (idade[x] > 13 && altura[x] < mediaalt) {
				
				aluno = aluno + 1;
				System.out.println(aluno);
					entrada.close();
			}
		}
		
		
}
}
