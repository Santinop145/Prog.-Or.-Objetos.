package holaprivate;

public class Persona{
	private String nombre;
	private int edad;
	
	Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		if(nombre.trim().length() < 1) {
			System.out.println("Debes proporcionar un nombre.");
		}else
			this.nombre = nombre;
	}

	public void setEdad(int edad) {
		if(edad > 120 || edad < 0) {
			System.out.println("La edad no puede superar los 120 años o ser negativa.");
		}else
			this.edad = edad;
	}

	public static void main(String[] args) {
		Persona newPersona = new Persona("Carlos", 50);
		System.out.println(newPersona.getEdad());
		System.out.println(newPersona.getNombre());
		
		newPersona.setEdad(40);
		newPersona.setNombre("Fabian");
		
		System.out.println(newPersona.getEdad());
		System.out.println(newPersona.getNombre());
		
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
		
		
	}
}

