package otraclase;
import java.util.Scanner;

public class Clase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1)
		
		/*
		System.out.println("Ingrese el numero.");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
		*/
		
		// 2)
		
		/*
		for (int i = 100; i > 0; --i) {
			System.out.println(i);
		}
		*/
		
		// 3)
		
		/*
		System.out.println("Ingrese el numero.");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		*/
		
		// 4)
		
		/*
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print(j*i + " ");
			}
			System.out.print("\n");
		}
		*/
		
		// 5)
		 
		/*
		System.out.println("Ingrese el numero.");
		int numero = sc.nextInt();
		int prevI = 1;
		
		for(int i = 1; i <= numero; i++) {
			prevI *= i;
			
			System.out.println(prevI);
		}
		*/
		
		// 6)
		
		int cantpares = 0;
		int cantimpares = 0;
		int numeros[];
		numeros = new int[15];
		
		System.out.println("Ingrese 15 numeros.");
		for(int i = 0; i < 15; i++) {
			numeros[i] = sc.nextInt();	
			
			if(numeros[i] % 2 == 1) {
				cantpares++;
			}
			else {
				cantimpares++;
			}
		}
		
		System.out.println("Cantidad de numeros pares: " + cantpares);
		System.out.println("Cantidad de numeros impares: " + cantimpares);
		
		sc.close();
	}

}
