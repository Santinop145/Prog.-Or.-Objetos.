package serialización;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

interface Serializable {	
	void guardarPersona(Persona persona);
	void cargarPersona(Persona persona);
}
