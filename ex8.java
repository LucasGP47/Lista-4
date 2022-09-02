import java.util.Scanner;

public class ex8 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x = 0, t, aux = -1;
		
		
		String[] cons = new String [21];
		cons[0] = "b";
		cons[1] = "c";
		cons[2] = "d";
		cons[3] = "f";
		cons[4] = "g";
		cons[5] = "h";
		cons[6] = "j";
		cons[7] = "k";
		cons[8] = "l";
		cons[9] = "m";
		cons[10] = "n";
		cons[11] = "p";
		cons[12] = "q";
		cons[13] = "r";
		cons[14] = "s";
		cons[15] = "t";
		cons[16] = "v";
		cons[17] = "w";
		cons[18] = "x";
		cons[19] = "y";
		cons[20] = "z";
		
		String[] vogal = new String[5];
		vogal[0] = "a";
		vogal[1] = "e";
		vogal[2] = "i";
		vogal[3] = "o";
		vogal[4] = "u";
		
		System.out.println("Informe o tamanho da senha que deseja: ");
		
		t = entrada.nextInt();
		
		
		String[] senha = new String [t];
		
		for ( x = 0; x < t ; x++) {
			entrada.close();
	        if (x % 2 == 0) {
	        	
	        	 senha[x] = cons[x]; 
	        }
	        	
	        else {
	        	
	            aux++;
	            senha[x] = vogal[aux];
	            
	            if(aux == 4) {
	                aux = -1;
	                
	            }
	        }
	    }
		
	    for (x = 0; x < t; x++) {
	    	
	        System.out.print(senha[x]);
	        
	       
				
 
	    }
				
}
}
