package animales;

public class Perro extends Animal{
	int dependencia = 0;
	
	Perro(double vida, String especie, double fuerza, int dependencia, boolean vivo) {
		super(vida, especie, fuerza, vivo);
	}
	
	void escapar(){
		if(dependencia < 60) {
			if(Math.random()*100 > 60) {
				System.out.println("El perro escapo.");
			} else {
				System.out.println("El escape fallo.");
			}
		} else {
			System.out.println("El perro no quiere escapar.");
		}
	}
	
	void maullar(){
		System.out.println("guau");
	}
	
	@Override
	
	void alimentarse() {
		super.alimentarse();
		System.out.println("El perro come carne.");
	}
}
