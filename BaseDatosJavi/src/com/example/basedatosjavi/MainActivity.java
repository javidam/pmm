package com.example.basedatosjavi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button bcolegio, bpersonal, bprofesores, bconsultas;
	Intent inte;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		bcolegio=(Button)findViewById(R.id.Centros);
		bpersonal=(Button)findViewById(R.id.Personal);
		bprofesores=(Button)findViewById(R.id.Profesores);
		bconsultas=(Button)findViewById(R.id.Consultas);
		
		
		bcolegio.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				inte=new Intent(MainActivity.this,Colegios.class);
				startActivity(inte);
				// TODO Auto-generated method stub
				
			}
		});
		bpersonal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				inte=new Intent(MainActivity.this,Personal.class);
				startActivity(inte);
				
			}
		});
	bprofesores.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
