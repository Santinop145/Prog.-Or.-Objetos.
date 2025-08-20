package tpEncapsulamiento;

public class Direccion {
	private String calle;
	private String ciudad;
	
	Direccion(String calle, String ciudad){
		this.calle = calle;
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		if(ciudad.trim().length() < 1) {
			System.out.println("Debes proporcionar una ciudad.");
		}else
			this.ciudad = ciudad;
	}

	public void setCalle(String calle) {
		if(calle.trim().length() < 1) {
			System.out.println("Debes proporcionar una calle.");
		}else
			this.calle = calle;
	}
}
