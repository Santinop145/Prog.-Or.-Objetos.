package tpEncapsulamiento;

public class EmailUsuario {
	private String email;
	
	EmailUsuario(String email){
		this.email = email;
	}
	
	public void setEmail(String email) {
		if(email.indexOf('@') > -1) {
			this.email = email;
		}else
			System.out.println("Se debe proporcionar un correo electronico valido.");
	}
	
	public String getEmail() {
		return email;
	}
}
