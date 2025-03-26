package scanner;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Practica 2
		
		/* int promedioInt = 0;
		double nota1 = 0;
		double nota2 = 0;
		System.out.println("Ingrese la primera nota");
		nota1 = sc.nextDouble();
		System.out.println("Ingrese la segunda nota");
		nota2 = sc.nextDouble();
		double promedio = (nota1 + nota2) / 2;
		promedioInt = (int) promedio;
		System.out.println("El promedio es: " + promedioInt);
		*/
		
		/*System.out.println("Ingrese la cantidad en Celsius");
		double Celsius = sc.nextDouble();
		double Fahrenheit = Celsius * 9/5 + 32;
		System.out.println("El resultado de " + Celsius + "° Celsius a Fahrenheit es: " + (int) Fahrenheit);
		*/
		
		/*System.out.println("Ingrese la cantidad de segundos.");
		int segundos = sc.nextInt();
		double minutos = segundos / 60;
		int segundosRestantes = segundos % 60;
		System.out.println(segundos + " segundo/s a minuto/s son: " + minutos + " minuto/s y los segundo/s restantes son: " + segundosRestantes);
		*/
		
		// Practica 3
		
		/*System.out.println("Escribe tu nombre: ");
		String nombre = sc.next();
		System.out.println("Escribe tu apellido: ");
		String apellido = sc.next();
		String nombrecompleto = (nombre + " " + apellido);
		System.out.println("La longitud de tu nombre es: " + nombre.length() + "\nEn mayusculas es: " + nombre.toUpperCase() + "\nEn minusculas: " + nombre.toLowerCase() + "\nTu nombre completo es: " + nombrecompleto + "\nEl indice de tu apellido: " + nombrecompleto.indexOf(apellido))
		;
		sc.close();
		 */
		
		// Practica 4
		
		int golesafavor = 22;
		int golesencontra = 7;
		
		System.out.println("Goles a favor hasta ayer: " + golesafavor + "\nGoles en contra hasta ayer: " + golesencontra);
		
		int diferencia = golesafavor;
		golesafavor += 4;
		diferencia = golesafavor - diferencia;
		int diferenciaencontra = golesencontra;
		golesencontra++;
		diferenciaencontra = golesencontra - diferenciaencontra;
		
		System.out.println("Goles a favor actuales: " + golesafavor + "\nGoles en contra actuales: " + golesencontra + "\nLa diferencia es: " + diferencia + " de goles a favor y " + diferenciaencontra + " de goles en contra.");
	}

}
