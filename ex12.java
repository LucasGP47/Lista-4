import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i1 = 0, i2 = 0;
		float a1 = 0, a2 = 0;
		float maior = 0;
		float menor = 999999999;
		int velho = 0, novo = 999999999;
		int [] idade = new int [5]; 
		float [] altura = new float [5]; 
		
		for (int x = 0; x < 5; x++) {
			System.out.println("Informe as idades: ");
			idade[x] = entrada.nextInt();
			System.out.println("Informe agora a altura: ");
			altura[x] = entrada.nextFloat();
			if (altura[x] > maior) {
			    maior = altura[x];
			    i1 = idade[x];
			}
			if (altura[x] < menor) {
				menor = altura[x];
				i2 = idade[x];
				}
			if (idade[x] > velho) {
				velho = idade[x];
				a1 = altura[x];
				}
			if (idade[x] < novo) {
				novo = idade[x];
				a2 = altura[x];
				}
		}
		
		System.out.println("Os dados digitados foram: ");
		System.out.println("Idade: ");
		for (int x = 0; x < 5; x++) {
			System.out.print(idade[x] + "; ");
		}
		System.out.println("");
		System.out.println("Altura: ");
		
		for (int x = 0; x < 5; x++) {
			System.out.print(altura[x] + "; ");
		}
		System.out.println("");
		System.out.println("O maior foi: " + maior + " e sua idade e: " + i1);
		System.out.println("O menor foi: " + menor + " e sua idade e: " + i2);
		System.out.println("O mais velho foi : " + velho + " e sua altura e: " + a1);
		System.out.println("O mais novo foi : " + novo + " e sua altura e: " + a2);
	    entrada.close();
			
		
	}

}
