package trabajo;

public class Gato extends Animal{
	int dependencia = 0;
	
	Gato(double vida, String especie, double fuerza, int dependencia, boolean vivo) {
		super(vida, especie, fuerza, vivo);
	}
	
	void escapar(){
		if(dependencia < 60) {
			System.out.println("El gato escapo.");
		}
	}
	
	void maullar(){
		System.out.println("miau");
	}
}