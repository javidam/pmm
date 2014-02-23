package com.example.basedatosjavi;

public class Centros {
	String nombre, direccion, telefono, codigo, nuplazas, tipo;

	
	public Centros (String codigo, String tipo, String nombre, 
			String direccion, String telefono, String nuplazas) {
		this.codigo = codigo;
		this.tipo = tipo;		
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nuplazas = nuplazas;		
	}

}
