package tpEncapsulamiento;

public class Pasaporte {
	private int emision;
	private String pais;
	
	Pasaporte(int emision, String pais){
		this.emision = emision;
		this.pais = pais;
	}
	public int getNumeroEmision() {
		return emision;
	}
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		if(pais.trim().length() < 1) {
			System.out.println("Debes proporcionar un pais.");
		}else
			this.pais = pais;
	}

	public void setEmision(int emision) {
		this.emision = emision;
	}
}
