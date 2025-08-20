package tpEncapsulamiento;

public class Motor {
	private int potencia;
	private String tipo;
	
	Motor(int potencia, String tipo){
		this.potencia = potencia;
		this.tipo = tipo;
	}
	public int getPotencia() {
		return potencia;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo.trim().length() < 1) {
			System.out.println("Debes proporcionar un tipo.");
		}else
			this.tipo = tipo;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
