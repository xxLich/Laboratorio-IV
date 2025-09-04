package ejercicio_1;

public class Empleado {
	public final int id;
	public String nombre;
	public int edad;
	
	private static int cont = 1000;
	
	Empleado() {
		id = cont;
		nombre = "sin nombre";
		edad = 99;
		
		cont++;
	}
	
	Empleado(String nombre, int edad) {
		id = cont;
		this.nombre = nombre;
		this.edad = edad;
		
		cont++;
	}

	public static int develveProximoID() {
		return cont;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Edad=" + edad + "]";
	}
}