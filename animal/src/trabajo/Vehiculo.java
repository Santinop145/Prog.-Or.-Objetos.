package animales;

import java.util.Scanner;

public class Vehiculo{
	boolean encendido;
	String marca;
	String modelo;
	
	Vehiculo(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		this.encendido = false;
	}
	
	void encender() {
		this.encendido = true;
		System.out.println("Se encendio el vehiculo.\n");
	}
	
	void estado() {
		System.out.println(this.toString());
	}
	
	@Override

	public String toString() {
		return "Modelo: " + this.modelo + "\n" + "Marca: " + this.marca + "\n" + "Encendido: " + this.encendido + "\n";
	}
	
	public static void main(String args[]){
		Vehiculo vehiculo = new Vehiculo("Ford", "Idk");
		
		vehiculo.estado();
		vehiculo.encender();
		vehiculo.estado();
		
		Auto auto = new Auto("Renault", "bro");
		
		auto.estado();
		auto.encender();
		auto.estado();
		
		Moto moto = new Moto("Yamaha", "???");
		
		moto.estado();
		moto.encender();
		moto.estado();
		
		Bici bici = new Bici("???", "CJ");
		
		bici.estado();
		bici.encender();
		bici.estado();
		}
}
