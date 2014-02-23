package com.example.basedatosjavi;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Colegios extends Activity {
	
	EditText tcodigo, ttipo, tnombre, tdireccion, ttelefono, tnuplazas;
	Button binsertar;
	int codigo, nuplazas;
	String  direccion, telefono, nombre;
	Character tipo;
	
	BaseDatos Bd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.colegios);
		
		Bd= new BaseDatos(Colegios.this, "BaseDatosEntera", null, 1);
		
		tcodigo=(EditText)findViewById(R.id.codigoCentro);
		ttipo=(EditText)findViewById(R.id.tipoCentro);
		tnombre=(EditText)findViewById(R.id.nombreCentro);
		tdireccion=(EditText)findViewById(R.id.direccionCentro);
		ttelefono=(EditText)findViewById(R.id.telefonoCentro);
		tnuplazas=(EditText)findViewById(R.id.numeroplazas);
		
		
		binsertar=(Button)findViewById(R.id.botonI);
		
		
		binsertar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//codigo para insertar
				codigo=Integer.parseInt(tcodigo.getText().toString());
				tipo=ttipo.getText().toString().charAt(0);
				direccion=tdireccion.getText().toString();
				telefono=ttelefono.getText().toString();
				nombre=tnombre.getText().toString();
				nuplazas=Integer.parseInt(tnuplazas.getText().toString());
				
				SQLiteDatabase bd;
				bd= Bd.getWritableDatabase();
				
				bd.execSQL("INSERT INTO centro values ("+codigo+",'"+tipo+"',\""+nombre+"\",\""+direccion+"\",\""+telefono+"\","+nuplazas+"):");
				bd.close();
			}
		});
		
		
		
	}

}
