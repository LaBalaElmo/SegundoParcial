package segundoParcial.memento;

public class Archivo {
	private int version;
	private String contenido;



	public Archivo(int version, String contenido) {
		this.version = version;
		this.contenido = contenido;
	}

	public int getVerion() {
		return version;
	}

	public void setVerion(int verion) {
		this.version = verion;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void info() {
		System.out.println("version: " + version);
		System.out.println("Contenido: " + contenido);
	}

}
