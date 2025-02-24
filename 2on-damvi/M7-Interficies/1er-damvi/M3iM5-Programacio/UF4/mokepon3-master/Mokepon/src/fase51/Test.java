/**
 * Mokepon 1.1 .- Classes - Objectes
 * Mokepon 1.2 .- Constructors - Enums - toString
 * Mokepon 1.3 .- Atributs "embeded", arraylist
 * Mokepon 1.4 .- Relaci� entre objectes
 * Mokepon 2.1	.- Her�ncia (extends), super	
 * Mokepon 3	.- privacitat, accessors (setter, getter), toString, est�tiques
 * Mokepon 4.1	.- Cl�sses abstractes	
 * Mokepon 4.2	.- Interficies	
 * Mokepon 5.1	.- Excepcions gen�riques
 */
package fase51;

import java.util.ArrayList;

public class Test {

	public static void main(String[]args) {
			
		Mokepon marmander = new  Mokepon("Manmarder");
		Mokepon mulmasaur = new  Mokepon("Mulmasaur");
		
		ArrayList mokedex = new ArrayList<Mokepon>();
		
		mokedex.add(marmander);
		mokedex.add(mulmasaur);
		mokedex.add(new Mokepon("sauron", Tipus.FOC));
		
		
		try {
			Ou marmasaur = marmander.reproduccio(marmander);
		} catch (Exception e) {
			System.out.println("\n" + e.getMessage() + "\n");
		}
		finally {
			System.out.println(marmander.getNom() + " est� molt cansat");
		}
		
		System.out.println(mulmasaur);
		
	}
}
