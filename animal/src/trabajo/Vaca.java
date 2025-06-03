package animales;

public class Vaca extends Animal{
	int dependencia = 0;
	
	Vaca(double vida, String especie, double fuerza, int dependencia, boolean vivo) {
		super(vida, especie, fuerza, vivo);
	}
	
	void escapar(){
		if(dependencia < 60) {
			if(Math.random()*100 > 60) {
				System.out.println("La vaca escapo.");
			} else {
				System.out.println("El escape fallo.");
			}
		} else {
			System.out.println("La vaca no quiere escapar.");
		}
	}
	
	
	void maullar(){
		System.out.println("mooo");
	}
	
	@Override
	
	void alimentarse() {
		super.alimentarse();
		System.out.println("La vaca come pasto.");
	}
}
