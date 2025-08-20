package tpEncapsulamiento;

public class Producto {
	private String nombre;
	private int precio;
	
	Producto(String nombre, int precio){
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		if(nombre.trim().length() < 1) {
			System.out.println("Debes proporcionar un nombre.");
		}else
			this.nombre = nombre;
	}

	public void setPrecio(int precio) {
		if(precio <= 0) {
			System.out.println("El precio no puede ser cero o negativo.");
		}else
			this.precio = precio;
	}
}
