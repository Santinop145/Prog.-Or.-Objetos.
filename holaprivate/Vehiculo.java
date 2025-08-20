package tpEncapsulamiento;

public class Vehiculo {
	private String patente;
	private int velocidadMaxima;
	
	Vehiculo(String patente, int velocidadMaxima){
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void setPatente(String patente) {
		if(patente.length() < 6 || patente.length() > 7) {
			System.out.println("La patente debe tener entre 6 y 7 caracteres.");
		}else
			this.patente = patente;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		if(velocidadMaxima < 60 || velocidadMaxima > 250) {
			System.out.println("La velocidad maxima debe estar entre un rango de 60 y 250 km/h.");
		}else
			this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
}
