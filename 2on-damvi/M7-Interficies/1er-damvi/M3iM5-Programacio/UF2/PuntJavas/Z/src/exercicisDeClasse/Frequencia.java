package exercicisDeClasse;

import java.util.Scanner;

public class Frequencia {

	public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);

	        String frasse = sc.nextLine();

	        frasse = frasse.toLowerCase();
	        frasse = frasse.replaceAll(" ", "");
	        System.out.println(frasse);

	        /*
	        objectiu : saber quantes vegades apareix cada lletra
	        com ho farem: haur� de rec�rrer lletra a lletra la frasse
	        per cada lletra he d'incrementar el n�mero de vegades que ha sortit
	             haur� d'identificar la lletra i fer +1
	             on ficar� les vegades que ha sortit cada lletra? en un vector
	        al final haur� de mostrar per pantalla el n�mero de vegades que ha sortit cada lletra
	        */

	        //declaro vector on deixar� freq��ncia de cada lletra
	        int [] freq = new int[26];
	        //int [] freq = new int['z'-'a'];

	        Character c;

	        //inicialitzar el vector
	        for (int i=0;i<26;i++) {
	            freq[i]=0;
	        };

	        //comprovaci�
	        for (int i=0;i<26;i++) {
	            c = (char) (97 + i);        //97 �s el codi ascii de lletra 'a'
	            System.out.println("Lletra " + c + ":" + freq[i]);
	        }
	   

	        //rec�rrer la frasse, car�cter a car�cter, identificar quina lletra �s i incrementar la seva freq��ncia
	        for(int i=0;i<frasse.length();i++) {
	                Character lletra = frasse.charAt(i);
	                int posicio = lletra - 'a'; //   'h' - 'a' -->   104 - 97 --> 7
	                freq[posicio] ++;
	        }

	        //comprovaci�
	        for (int i=0;i<26;i++) {
	            c = (char) (97 + i);        //97 �s el codi ascii de lletra 'a'
	            System.out.println("Lletra " + c + ":" + freq[i]);
	        }
	}
}
