package serialización;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;

public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	ArrayList<Persona> listaPersona = new ArrayList<>();
	String nombre;
	int edad;
	
	Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	void verNombre() {
		System.out.println(this.nombre);
	}
	
	public void guardarPersona(Persona persona) {
		ObjectOutputStream serializador = null;
		try {
		  serializador = new ObjectOutputStream(new FileOutputStream("persona.ser"));
		  serializador.writeObject(listaPersona);
		} catch (IOException ioe) { 
		  
		} finally {
		  if (serializador != null)
		     try {
		      serializador.close();
		   } catch (IOException ioe) {
		      ioe.printStackTrace();
		   }
		 }
	}

	public void cargarPersona(Persona persona) {
		ObjectInputStream deserializador = null;
		try {
		  deserializador = new ObjectInputStream(new FileInputStream("persona.ser"));
		  listaPersona = (ArrayList<Persona>)deserializador.readObject();
		} catch (FileNotFoundException fnfe ) {
		  fnfe.printStackTrace();
		} catch (ClassNotFoundException cnfe ) { 
		  cnfe.printStackTrace();
		} catch (IOException ioe) { 
		  ioe.printStackTrace();
		} finally {
		  if (deserializador != null)
		  try {
		    deserializador.close();
		  } catch (IOException ioe) { 
		    ioe.printStackTrace();
		  }
		}
	}
}