/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

/**
 *
 * @author crami
 */
public class Sala {
 
	String tituloPelicula;
	int Asientos;
	int clientes;
 
	// metodo constructor
	public Sala() {
		clientes = 20;
		tituloPelicula =  "";
	}
 
	public String getTituloPelicula() {
		return tituloPelicula;
	}
 
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
 
	public int getAsientos() {
		return Asientos;
	}
 
	public void setAsientos(int asientos) {
		Asientos = asientos;
	}
 
	public int getClientes() {
		return clientes;
	}
 
	public void setClientes(int clientes) {
		this.clientes = clientes;
	}
 
}