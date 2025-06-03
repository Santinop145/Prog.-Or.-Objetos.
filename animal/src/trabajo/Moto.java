package animales;

public class Moto extends Vehiculo{
	Moto(String marca, String modelo){
		super(marca, modelo);
	}
	
	@Override
	void encender() {
		this.encendido = true;
		System.out.println("Se encendio la moto.\n");
	}
}
