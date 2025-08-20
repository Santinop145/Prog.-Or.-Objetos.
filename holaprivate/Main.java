package tpEncapsulamiento;

import java.util.ArrayList;

public class Main{
	public static int calcularPedido(ArrayList<Producto> productos) {
		int total = 0;
		for (Producto p : productos) {
			total += p.getPrecio();
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		Direccion newDireccion = new Direccion("Siempreviva 456", "Springfield");
		Pasaporte newPasaporte = new Pasaporte(23523, "Estados Unidos");
		Persona newPersona = new Persona("Carlos", 50, newDireccion, newPasaporte);
		System.out.println(newPersona.getEdad());
		System.out.println(newPersona.getNombre());
		
		newPersona.setEdad(40);
		newPersona.setNombre("Fabian");
		
		System.out.println(newPersona.getEdad());
		System.out.println(newPersona.getNombre());
		
		Motor newMotor = new Motor(100, "Diesel");
		Auto newAuto = new Auto(newMotor, "Ford");
		
		System.out.println(newAuto.getMarca());
		System.out.println(newAuto.getMotor());
		
		Producto newProducto = new Producto("Shampoo", 400);
		System.out.println(newProducto.getPrecio());
		System.out.println(newProducto.getNombre());
		
		newProducto.setPrecio(520);
		newProducto.setNombre("Jabon");
		
		System.out.println(newProducto.getPrecio());
		System.out.println(newProducto.getNombre());
		
		EmailUsuario newEmail = new EmailUsuario("santinoalessandrop@gmail.com");
		
		System.out.println(newEmail.getEmail());
		
		newEmail.setEmail("santinoportaluppi145@gmail.com");
		
		System.out.println(newEmail.getEmail());
		
		Vehiculo newVehiculo = new Vehiculo("AA724DD", 80);
		
		System.out.println(newVehiculo.getPatente());
		System.out.println(newVehiculo.getVelocidadMaxima());
		
		newVehiculo.setPatente("AA335BE");
		newVehiculo.setVelocidadMaxima(200);
		
		System.out.println(newVehiculo.getPatente());
		System.out.println(newVehiculo.getVelocidadMaxima());
		
		Transferencia newTransferencia = new Transferencia(10000, "1238128382138128234524213","1238134567138128234524213");
		
		System.out.println(newTransferencia.getMonto());
		System.out.println(newTransferencia.getCbuOrigen());
		System.out.println(newTransferencia.getCbuDestino());
		
		int iterador = 0;
		ArrayList<Producto> producto = new ArrayList<>();
		producto.add(new Producto("Producto 1", 100));
		producto.add(new Producto("Producto 2", 200));
		producto.add(new Producto("Producto 3", 500));
		
		Pedido pedido = new Pedido(0);
		for(Producto p : producto) {
			iterador++;
			pedido.setProductos(iterador);
		}
		
		System.out.println("El total de productos en el pedido: " + pedido.getProductos() 
		+ "\n Todos los productos:");
		for(Producto p : producto) {
		    System.out.println(p.getNombre() + " - $" + p.getPrecio());
		}
		
		System.out.println("En total te saldria: $" + calcularPedido(producto));
		} 
	}
}

