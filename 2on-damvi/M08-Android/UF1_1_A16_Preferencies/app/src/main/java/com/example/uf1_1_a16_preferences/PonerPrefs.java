package com.example.uf1_1_a16_preferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;

public class PonerPrefs extends PreferenceActivity {
	String valor;
	@Override
    public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     addPreferencesFromResource(R.xml.preferencias);
     
      
     /* Amb l'anterior seria suficient, per� si volem afegir m�s variables 
       que no ha de veure l'usuari:  afegir dades clau-valor fariem:  */
     // Primer recuperar preferencies
     SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this); 
     // Accedemos a la clave del valor por si existe sino, valor per defecte
     valor= prefs.getString("VALOR", "valor defecto");
     // .....
     valor="Nou Valor"; // Asignem nou valor    
     // Al onStop`, gravarien les dades per tal de tenir-les a properes execucions.
     
     }	
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
		/* Per guardar dades a preferencies */
		
	    // Primer recuperar preferencies
	    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this); 
	  	// Creem editor de preferencies 
		SharedPreferences.Editor editorpreferencies = prefs.edit();
		// Posem valors com si fos un buddle
		editorpreferencies.putString("VALOR", valor);
		// fem commit
		editorpreferencies.commit();
		
		// �s correcte fer-al onStop?? I si guirem el dispositiu????
	}

    
     
     
    
	

  
}
