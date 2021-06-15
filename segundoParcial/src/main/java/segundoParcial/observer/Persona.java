package segundoParcial.observer;

public class Persona implements IPersona {
	private String nombre;
	private String categoria;

	public Persona(String nombre, String categoria) {
		this.setNombre(nombre);
		this.categoria = categoria;
	}

	@Override
	public void update(String message) {
		System.out.println("Nombre: " + nombre);
		System.out.println("Notificando: " + message);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
