package animales;

public class Auto extends Vehiculo{
	Auto(String marca, String modelo){
		super(marca, modelo);
	}
	
	@Override
	void encender() {
		this.encendido = true;
		System.out.println("Se encendio el auto.\n");
	}
}
