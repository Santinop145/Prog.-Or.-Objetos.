package tpEncapsulamiento;

public class Auto {
	private Motor motor;
	private String marca;
	
	Auto(Motor motor, String marca){
		this.motor = motor;
		this.marca = marca;
	}
	public String getMotor() {
		return motor.getTipo() + " " + motor.getPotencia();
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca){
		if(marca.trim().length() < 1) {
			System.out.println("Debes proporcionar una marca.");
		}else
			this.marca = marca;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}
