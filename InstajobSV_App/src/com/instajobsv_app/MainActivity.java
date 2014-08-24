package com.instajobsv_app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {
	
	String[] menu={"Tabla usuario","Llenar Base de Datos"};
	String[] activities={"UsuarioActivity"};  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu));
    }

    @Override
    protected void onListItemClick(ListView l,View v,int position,long id){
     super.onListItemClick(l, v, position, id);
     
     if(position!=1){
      
      String nombreValue=activities[position];
     
      try{
       Class<?>
       clase=Class.forName("com.instajobsv_app."+nombreValue);
       Intent inte = new Intent(this,clase);
       this.startActivity(inte);
      }catch(ClassNotFoundException e){
       e.printStackTrace();
      }
     
     }else{
     }
   }
} 

