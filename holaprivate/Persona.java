package tpEncapsulamiento;

public class Persona{
	private String nombre;
	private int edad;
	private Direccion direccion;
	private Pasaporte pasaporte;
	
	Persona(String nombre, int edad, Direccion direccion, Pasaporte pasaporte){
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.pasaporte = pasaporte;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getDireccion() {
		return direccion.getCalle() + " " + direccion.getCiudad();
	}
	public String getPasaporte() {
		return pasaporte.getNumeroEmision() + " " + pasaporte.getPais();
	}

	public void setNombre(String nombre) {
		if(nombre.trim().length() < 1) {
			System.out.println("Debes proporcionar un nombre.");
		}else
			this.nombre = nombre;
	}

	public void setEdad(int edad) {
		if(edad > 120 || edad < 0) {
			System.out.println("La edad no puede superar los 120 años o ser negativa.");
		}else
			this.edad = edad;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}
}

