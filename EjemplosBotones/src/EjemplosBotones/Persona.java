package EjemplosBotones;

public class Persona 
{
	private int edad;
	private String nombre;
	private String apellido;
	
	/////////////////CONSTRUCTOR///////////////////
	
	public Persona(int edad, String nombre, String apellido)
	{
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	///////////// getes and setes//////////////
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
}
