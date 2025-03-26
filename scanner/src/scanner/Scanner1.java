package scanner;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("Escribe tu nombre: ");
		String nombre = sc.next();
		System.out.println("Escribe tu apellido: ");
		String apellido = sc.next();
		String nombrecompleto = (nombre + " " + apellido);
		System.out.println("La longitud de tu nombre es: " + nombre.length() + "\nEn mayusculas es: " + nombre.toUpperCase() + "\nEn minusculas: " + nombre.toLowerCase() + "\nTu nombre completo es: " + nombrecompleto + "\nEl indice de tu apellido: " + nombrecompleto.indexOf(apellido))
		;
		sc.close();
	}

}
