package practica2;
import java.util.Scanner;

public class MainSwitch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cotiDia = 1180;
		double saldo = 10000.5;
		double saldoEnDolar = 2;
		double [] saldoArray = {saldo, saldoEnDolar};
		boolean infinito = true;
		while(infinito) {
		System.out.println("1) Consultar saldo.");
		System.out.println("2) Ingresar dinero.");
		System.out.println("3) Extraer dinero.");
		System.out.println("4) Dolar.");
		System.out.println("5) Salir.");
		int opcion = sc.nextInt();
		switch(opcion) {
			case 1:
				System.out.println("Su saldo es: " + saldoArray[0] + "\nSu saldo en dolares es: " + saldoArray[1]);
				System.out.println("Elige otra opcion\n");
				break;
			case 2:
				System.out.println("Ingrese el monto a ingresar.");
				double saldoAIngresar = sc.nextDouble();
				if(saldoAIngresar > 0) {
					saldoArray[0] = saldoArray[0] + saldoAIngresar;
					System.out.println("Elige otra opcion\n");
				}
				else {
					System.out.println("El saldo a ingresar no puede ser negativo.\nElige otra opcion.");
				}
				break;
			case 3:
				System.out.println("Ingrese el monto a extraer.");
				double saldoAExtraer = sc.nextDouble();
				if(saldoAExtraer < saldoArray[0] && saldoAExtraer > 0) {
					saldoArray[0] = saldoArray[0] - saldoAExtraer;
					System.out.println("Elige otra opcion\n");
				}else {
					System.out.println("El saldo a extraer no puede ser negativo.\nElige otra opcion.\n");
				}
				break;
			case 4:
				System.out.println("La cotización del dia es: " + cotiDia);
				System.out.println("Quiere comprar dolares? Y/N");
				if(sc.next().equals("Y") || sc.next().equals("y")) {
					System.out.println("Ingrese el monto en dolares a comprar.");
					double montoDolares = sc.nextDouble();
					if(montoDolares*1180 < saldoArray[0]) {
						saldoArray[0] = saldoArray[0] - montoDolares*1180;
						saldoArray[1] = saldoArray[1] + montoDolares;
						System.out.println("Elige otra opcion\n");
					}else {
						System.out.println("El monto a comprar no puede superar el saldo.\nElige otra opcion.");
					}
				}else {
					System.out.println("Elige otra opcion\n");
				}
				break;
			case 5:
				System.out.println("Cerrando el programa, adios.");
				infinito = false;
				break;
			}
		}
		sc.close();
	}
}