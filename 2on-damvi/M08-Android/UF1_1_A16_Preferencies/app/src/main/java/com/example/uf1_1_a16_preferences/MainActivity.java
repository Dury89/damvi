package com.example.uf1_1_a16_preferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        Button editPrefs = (Button) findViewById(R.id.prefButton);
      

        editPrefs.setOnClickListener(new View.OnClickListener() {
               public void onClick(View view) {  
            	 
                   Intent myIntent = new Intent(view.getContext(), PonerPrefs.class);                
                   
                   startActivityForResult(myIntent, 0);
               }

       });
     
      
       Button showPrefs = (Button) findViewById(R.id.showButton);
      

       showPrefs.setOnClickListener(new View.OnClickListener() {
               public void onClick(View view) {
                   Intent myIntent = new Intent(view.getContext(), ShowPrefs.class);
                   startActivityForResult(myIntent, 0);
               }

       });
    
    }



  
}
