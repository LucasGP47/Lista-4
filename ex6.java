import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float medias = 0, soma = 0;
		
		float [] aluno1 = new float [4];
		float [] aluno2 = new float[4];
		float [] aluno3 = new float [4];
		float [] aluno4 = new float [4];
		
		float [] media = new float [4];
		
		int x =0;
		
		for (x = 0; x < 4; x++) {
			System.out.print("Informe as notas do aluno 1: ");
			aluno1[x] = entrada.nextFloat();
			soma = soma + aluno1[x];
			medias = soma / 4;
			
			if (x > 1000000000) {
				entrada.close();
			}
		}
		soma = 0;
		System.out.println("///////////////////////////////");
		media[0] = medias;
		medias = 0;
		for (x = 0; x < 4; x++) {
			System.out.print("Informe as notas do aluno 2: ");
			aluno2[x] = entrada.nextInt();
			soma = soma + aluno2[x];
			medias = soma / 4;
		}
		soma = 0;
        System.out.println("///////////////////////////////");
		media[1] = medias;
		medias = 0;
		for (x = 0; x < 4; x++) {
			System.out.print("Informe as notas do aluno 3: ");
			aluno3[x] = entrada.nextInt();
			soma = soma + aluno3[x];
			medias = soma / 4;
		}
		
		media[2] = medias;
		System.out.println("///////////////////////////////");
		medias = 0;
		soma = 0;
		for (x = 0; x < 4; x++) {
			System.out.print("Informe as notas do aluno 4: ");
			aluno4[x] = entrada.nextInt();
			soma = soma + aluno4[x];
			medias = soma / 4;
		}

		media[3] = medias;
		
		System.out.println("Media dos alunos: ");
		
		for (x = 0; x < 4; x++) {
			System.out.print(media[x] + "; ");
		}
		System.out.println("");
		System.out.println("Aprovados: ");
		
		for (x = 0; x < 4; x++) {
			if (media[x] >= 7) {
				System.out.print(media[x] + "; ");
			}
		}
 
	}

}
