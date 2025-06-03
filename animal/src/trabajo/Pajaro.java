package animales;

public class Pajaro extends Animal{
	int dependencia = 0;
	
	Pajaro(double vida, String especie, double fuerza, int dependencia, boolean vivo) {
		super(vida, especie, fuerza, vivo);
	}
	
	void escapar(){
		if(dependencia < 60) {
			if(Math.random()*100 > 60) {
				System.out.println("El pajaro escapo.");
			} else {
				System.out.println("El escape fallo.");
			}
		} else {
			System.out.println("El pajaro no quiere escapar.");
		}
	}
	
	
	void maullar(){
		System.out.println("cak");
	}
	
	@Override
	
	void alimentarse() {
		super.alimentarse();
		System.out.println("El pajaro come insectos.");
	}
}
