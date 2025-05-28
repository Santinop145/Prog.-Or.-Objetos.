package trabajo;

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
	this.vida = vida += 2;
}

void curar(int cura) {
	this.vida += cura;
}

void atacar(Animal victima) {
	//Se ataca a un animal, la victima recibirAtaque(this.ataque)
	victima.recibirAtaque(this.fuerza);
	System.out.println("\nAtacante animal\n" + this.toString() + "\nVictima animal\n" + victima.toString());
}

void recibirAtaque(double daño) {
	vida -= daño;
	if(vida <= 0) {
		vivo = false;
	}
}

void reproducirse(Animal pareja) {
	//Si el animal es de la misma especie puede reproducirse
	if(this.especie.equals(pareja.especie)) {
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
		System.out.println("Los animales no son de la misma especie.");
	}
}

void estado(){
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

	System.out.println(a.toString() + b.toString() + c.toString());

	c.estado();
	a.atacar(c);
	a.reproducirse(a);
	b.reproducirse(b);
	a.reproducirse(a);
	
	arrayAnimales[0].estado();
	arrayAnimales[1].estado();
	arrayAnimales[2].estado();
	
	arrayAnimales[1].atacar(arrayAnimales[0]);
	arrayAnimales[1].atacar(arrayAnimales[0]);
	a.reproducirse(a);
	arrayAnimales[0].estado();
	
	Gato gato = new Gato(20, "Mamifero", 10, 70, true);
		
	gato.maullar();
	}
}