package exercicisDeClasse;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int casos = sc.nextInt();
			sc.nextLine();
			
			for (int i = 0; i < casos; i++) {
				
				String hey = sc.nextLine().toLowerCase().replaceAll(" ","");
				/*String hey = sc.nextLine();
				hey = hey.toLowerCase().replaceAll(" ","");*/
						
				boolean diferent = false;
				int j=0;
				
				//Compararem parelles per veure si s�n iguals
				//primera parella ser� "contingut de la posici� 0 i contingut de la posici� lenght()-1 (�ltima)
				//segona parella ser� "contingut de la posici� 1 i contingut de la posici� lenght()-1-1 (pen�ltima)
				//buscarem la primer parella diferent.
				
				while(!diferent && j<hey.length()/2) {
					if(hey.charAt(j) != hey.charAt(hey.length()-1-j))
						diferent = true;
					else
						j++;
				}	
				
				if (diferent)
					System.out.println("NO");
				else
					System.out.println("SI");
		}

	}
}
