package PracticaParcial;
import java.util.Scanner;

public class PracticaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Registrarse.\n");
		System.out.println("Usuario: ");
		String usuarioGuardado = sc.next();
		System.out.println("Contraseña: ");
		String contraseñaGuardada = sc.next();
		while(true){
			if(contraseñaGuardada.length() < 6) {
				System.out.println("La contraseña no puede ser menor a 6 digitos, ingresa una nueva: ");
				contraseñaGuardada = sc.next();
			}
			else {
				break;
			}
		}
		
		System.out.println("");

		for(int intentos = 6; intentos > 0; intentos--) {
			System.out.println("Inicia sesion.\n");
			System.out.println("Usuario: ");
			String usuario = sc.next();
			System.out.println("Contraseña: ");
			String contraseña = sc.next();
			
			if(usuario.equals(usuarioGuardado) && contraseña.equals(contraseñaGuardada)) {
				System.out.println("\nSesion iniciada.");
				break;
			}
			else {
			    System.out.println("\nCredenciales incorrectas.");
				System.out.println("Intentos restantes: " + intentos);
			}
		}
		
		sc.close();
	}

}
