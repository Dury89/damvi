package mokepon7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FitxerDeBill {
	
	public static void main(String[] args) {
		
		//afageixObjecte();
		veureObjecte();
		

		
	}

	private static void veureObjecte() {
		
		try {
			File f = new File("src\\resources\\mokepon7\\objectes.dat");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Pocio p = (Pocio) ois.readObject();
			System.out.println(p);
		} catch (FileNotFoundException e) {
			System.out.println("no existeix el fitxer");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("excepci d'entrada/sortida");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("no s'ha trobat la classe demanada");
			e.printStackTrace();
		}

		
	}

	private static void afageixObjecte() {
		
		try {

			File f = new File("resources\\mokepon7\\objectes.dat");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Pocio p = new Pocio("SuperPocio", 100);
			oos.writeObject(p);
			oos.flush();
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
