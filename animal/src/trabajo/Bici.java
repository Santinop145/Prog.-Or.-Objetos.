package animales;

public class Bici extends Vehiculo{
	Bici(String marca, String modelo){
		super(marca, modelo);
		encendido = true;
	}
	
	@Override
	void encender() {
		System.out.println("No podes encender una bici, estupido.\n");
	}
}
