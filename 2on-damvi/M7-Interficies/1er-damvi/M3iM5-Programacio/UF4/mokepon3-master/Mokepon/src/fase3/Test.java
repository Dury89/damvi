/**
 * Mokepon 1.1 .- Classes - Objectes
 * Mokepon 1.2 .- Constructors - Enums - toString
 * Mokepon 1.3 .- Atributs "embeded", arraylist
 * Mokepon 1.4 .- Relaci� entre objectes
 * Mokepon 2.1	.- Her�ncia (extends), super	
 * Mokepon 3	.- privacitat, accessors (setter, getter), toString, est�tiques
 */
package fase3;

public class Test {

	public static void main(String[]args) {
			
		Mokepon mulmasaur = new  Mokepon("Mulmasaur",5);
		System.out.println(mulmasaur);
		
		System.out.println("Mulmasaur es diu: " + mulmasaur.getNom());
		mulmasaur.setNom("Bartolo");
		System.out.println("Mulmasaur es diu ara: " + mulmasaur.getNom());
		
		
		Atac a1 = new Atac ("marmolillo", Tipus.FOC);
		Atac a2 = new Atac ("culebrilla", Tipus.PLANTA);
		mulmasaur.afegirAtac(a1);
		mulmasaur.afegirAtac(a2);
		
		if (mulmasaur instanceof Mokepon)
			System.out.println("Mulmausaur �s Mokepon");
		else
			System.out.println("Mulmausaur �s NO Mokepon");
		
		if (mulmasaur instanceof MokeponCapturat)
			System.out.println("Mulmausaur �s MokeponCapturat");
		else
			System.out.println("Mulmausaur �s NO MokeponCapturat");
		
		MokeponCapturat elMeuMikachu = new MokeponCapturat("Ambrosio",Tipus.FOC);
		System.out.println(elMeuMikachu);

		if (elMeuMikachu instanceof Mokepon)
			System.out.println("elMeuMikachu �s Mokepon");
		else
			System.out.println("elMeuMikachu �s NO Mokepon");
		
		if (elMeuMikachu instanceof MokeponCapturat)
			System.out.println("elMeuMikachu �s MokeponCapturat");
		else
			System.out.println("elMeuMikachu �s NO MokeponCapturat");
		
		mulmasaur.atacar(elMeuMikachu, 0);
		
		System.out.println("Tinc " + Mokepon.getNumMokepons());
	}
}
