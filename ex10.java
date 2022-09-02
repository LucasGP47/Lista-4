import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o dia da data: ");
		int dia = entrada.nextInt();
		
		while (dia > 31 || dia < 1){
			System.out.println("Data invalida.");
			break;
		}
		
		System.out.println("Informe o mes: ");
		int mes = entrada.nextInt();
		
		while (mes > 12 || mes < 1){
			System.out.println("Data invalida.");
			break;
		}
		
		System.out.println("Informe o ano: ");
		int ano = entrada.nextInt();
		
		int[] data = new int [3];
		
		data[0] = dia;
		data[1] = mes;
		data[2] = ano;
		
		System.out.println(data[0] + "/" + data [1] + "/" + data[2]);
		entrada.close();
		
		
		
		

	}

}
