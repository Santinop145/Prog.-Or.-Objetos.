package practica3;
import java.util.Scanner;

public class Main3 {
	/*
	public static void saludar(){
		System.out.println("Hola mundo.");
	}
	*/
	
	/*
	public static void saludarANombre(String nombre) {
		System.out.println("Bienvenido, " + nombre + ".");
	}
	*/
	
	/*
	public static int multiplicar(int x, int y) {
		return x*y;
	}
	*/
	
	/*
	public static int calcularArea(int lado, int altura){
		return lado*altura;
	}
	
	public static int calcularArea(int lado){
		return lado*lado;
	}
	*/
	
	public static int calculadora(int opcion, int x, int y) {
		if(opcion == 1) {
			return x+y;
		}
		else if(opcion == 2) {
			return x-y;
		}
		else if(opcion == 3) {
			return x*y;
		}
		else if(opcion == 4) {
			return x/y;
		}
		else if(opcion == 5) {
			System.out.println("Saliendo...");
			return 8888404;
		}
		else{
			System.out.println("Opcion invalida. Cerrando programa...");
			return 8888404;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		while(true) {
			if(sc.next().equals("saludar")){
				saludar();
			}
			else {
				break;
			}
		}
		*/
		
		/*
		String nombre = sc.next();
		saludarANombre(nombre);
		*/
		
		/*
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(multiplicar(x,y));
		*/
		
		/*
		int lado = 2;
		int altura = 6;
		
		System.out.println(calcularArea(lado));
		System.out.println(calcularArea(lado, altura));
		*/
		
		boolean infinito = true;
		while(infinito) {
			System.out.println("Ingrese dos numeros.");
			int numero1 = sc.nextInt();
			int numero2 = sc.nextInt();
			System.out.println("�Que desea hacer con estos numeros?\n1)Sumar.\n2)Restar.\n3)Multiplicar.\n4)Dividir.\n5)Salir.");
			int opcion = sc.nextInt();
			int resultado = calculadora(opcion, numero1, numero2);
			if(opcion >= 5) {
				infinito = false;
			}
			else {
				System.out.println("Resultado: " + resultado);
			}
		}
		
		sc.close();
	}
}
