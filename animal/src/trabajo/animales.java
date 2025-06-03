package animales;
import java.util.Scanner;

/* Atributo: vida, especie y fuerza
elemento main () crear nsq y animal

alimentarse() - vida +2
curar (int cura) - vida + cura
atacar (animal atacante)
recibirAataque(int ataque)
reproducirse() - crea otro animal con mitad de vida y fuerza

*/

class Animal{
static Animal[] arrayAnimales = new Animal[50];
double vida;
String especie;
double fuerza;
boolean vivo;


Animal (double vida, String especie, double fuerza, boolean vivo){
	this.vida = vida;
	this.especie = especie;
	this.fuerza = fuerza;
	this.vivo = vivo;
}

void alimentarse() {
	this.vida = vida += Math.round(Math.random()*10);
}

void curar(int cura) {
	this.vida += cura;
}

void atacar(Animal victima) {
	//Se ataca a un animal, la victima recibirAtaque(this.ataque)
	victima.recibirAtaque(this.fuerza);
	System.out.println("\n//\nAtacante animal\n" + this.toString() + "\nVictima animal\n" + victima.toString() + "//\n");
}

void recibirAtaque(double daño) {
	vida -= Math.round((Math.random() + 0.5)*daño);
	if(vida <= 0) {
		vida = 0;
		vivo = false;
	}
}

void reproducirse(Animal pareja) {
	//Si el animal es de la misma especie puede reproducirse
	if(this.especie.equals(pareja.especie) && this.vivo) {
		Animal nuevo = new Animal (this.vida / 2, this.especie, this.fuerza / 2, true);
		for(int animales = 0; animales < arrayAnimales.length; animales++) {
			if(arrayAnimales[animales] != null) {
				if(arrayAnimales[animales].vivo) {
					continue;
				}else {
					arrayAnimales[animales] = nuevo;
					break;
				}
			}else {
				arrayAnimales[animales] = nuevo;
				break;
			}
		}
	} else {
		if(!this.especie.equals(pareja.especie)) {
			System.out.println("Los animales no son de la misma especie.\n");
		} else {
			System.out.println("El animal no esta vivo.\n");
		}
	}
}

void estado(){
	if(this.vivo == false) {
		this.vida = 0;
	}
	System.out.println("Vida: "+vida+" | Especie: "+especie+" | Fuerza: "+fuerza+" | Vivo: "+vivo);
}

@Override

public String toString() {
	return "Vida: " + this.vida + "\n" + "Especie: " + this.especie + "\n" + "Fuerza: " + this.fuerza + "\n" + "Vivo: " + this.vivo + "\n";
}

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	Animal a = new Animal(50, "Mamifero", 25, true);
	Animal b = new Animal(28, "Reptil", 40, true);
	Animal c = new Animal(12, "Peces", 10, true);

	System.out.println(a.toString() + "\n" + b.toString() + "\n" + c.toString());

	c.estado();
	a.reproducirse(a);
	b.reproducirse(b);
	a.reproducirse(a);
	
	arrayAnimales[0].estado();
	arrayAnimales[1].estado();
	arrayAnimales[2].estado();
	
	arrayAnimales[1].atacar(arrayAnimales[0]);
	arrayAnimales[1].atacar(arrayAnimales[0]);
	c.reproducirse(c);
	arrayAnimales[0].estado();
	a.atacar(c);
	c.estado();
	
	System.out.println("\nPerro: ");
	Perro perro = new Perro(20, "Mamifero", 10, 70, true);
	perro.estado();
	perro.maullar();
	perro.alimentarse();
	perro.estado();
	perro.escapar();
	
	System.out.println("\nVaca: ");
	Vaca vaca = new Vaca(30, "Mamifero", 15, 85, true);
	vaca.estado();
	vaca.maullar();
	vaca.alimentarse();
	vaca.estado();
	vaca.escapar();
	}
}