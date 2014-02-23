package com.example.basedatosjavi;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertarColegio extends Activity{

	EditText tcodigo, ttipo, tnombre, tdireccion, ttelefono, tnuPlazas;
	Button binsertar, bconsultar; 
	int codigo, numPlazas;
	String  nombre, direccion, telefono;
	Character tipo;
	BaseDatos cabd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		cabd = new BaseDatos(InsertarColegio.this, "BaseDatosColegio", null, 1);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.insertarcolegio);
		
		tcodigo = (EditText)findViewById(R.id.editText1);
		ttipo = (EditText)findViewById(R.id.editText2);
		tnombre = (EditText)findViewById(R.id.editText3);
		tdireccion = (EditText)findViewById(R.id.editText4);
		ttelefono = (EditText)findViewById(R.id.editText5);
		tnuPlazas = (EditText)findViewById(R.id.editText6);
		
		
		
		binsertar = (Button)findViewById(R.id.button1);
		
		binsertar.setOnClickListener(new View.OnClickListener() {
			
			
			
			@Override
			public void onClick(View v) {
				
				codigo = Integer.parseInt(tcodigo.getText().toString());
				tipo = ttipo.getText().charAt(0);
				
				Log.d("char", tipo+"");
				nombre = tnombre.getText().toString();
				direccion = tdireccion.getText().toString();
				telefono = ttelefono.getText().toString();
				numPlazas = Integer.parseInt(tnuPlazas.getText().toString());
				
				
				SQLiteDatabase db;
				db = cabd.getWritableDatabase();
				
				if (codigo == 0 || nombre == null || direccion == null 
						|| telefono == null || numPlazas == 0) {
					Toast.makeText(InsertarColegio.this, "Es obligatorio rellenar todos los campos", Toast.LENGTH_LONG).show(); 
				} else {
					db.execSQL("INSERT INTO centros VALUES ("+codigo+",'"+tipo+"',\""+nombre+"\",\""+direccion+"\",\""+telefono+"\","+numPlazas+");");
					db.close();}
			}
		});
	}
}
