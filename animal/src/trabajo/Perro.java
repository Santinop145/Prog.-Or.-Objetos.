package trabajo;

public class Perro extends Animal{
	int dependencia = 0;
	
	Perro (double vida, String especie, double fuerza, int dependencia, boolean vivo) {
		super(vida, especie, fuerza, vivo);
	}
	
	void escapar(){
		if(dependencia < 60) {
			System.out.println("El perro escapo.");
		}
	}
	
	void ladrar(){
		System.out.println("guau");
	}
}