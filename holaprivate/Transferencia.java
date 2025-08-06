package holaprivate;

public class Transferencia {
	private int monto;
	private String cbuOrigen;
	private String cbuDestino;
	
	Transferencia(int monto, String cbuOrigen, String cbuDestino){
		this.monto = monto;
		this.cbuOrigen = cbuOrigen;
		this.cbuDestino = cbuDestino;
	}
	
	public void setMonto(int monto) {
		if(monto <= 0) {
			System.out.println("El monto debe ser mayor a 0");
		}else
			this.monto = monto;
	}
	
	public void setCbuOrigen(String cbuOrigen) {
		if((cbuOrigen.length() < 22 || cbuOrigen.length() > 22) && !cbuDestino.equals(cbuOrigen)) {
			System.out.println("El CBU debe tener 22 caracteres en total y no ser igual al de destino u origen.");
		}else
			this.cbuOrigen = cbuOrigen;
	}
	
	public void setCbuDestino(String cbuDestino) {
		if((cbuDestino.length() < 22 || cbuDestino.length() > 22) && !cbuDestino.equals(cbuOrigen)) {
			System.out.println("El CBU debe tener 22 caracteres en total y no ser igual al de destino u origen.");
		}else
			this.cbuDestino = cbuDestino;
	}
	
	public int getMonto() {
		return monto;
	}
	
	public String getCbuOrigen() {
		return cbuOrigen;
	}
	
	public String getCbuDestino() {
		return cbuDestino;
	}
}