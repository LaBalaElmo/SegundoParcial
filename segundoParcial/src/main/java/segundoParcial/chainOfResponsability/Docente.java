package segundoParcial.chainOfResponsability;

public class Docente extends Colleague {
	private int ci;
	private String nombre;

	public Docente(IChat mediator, int ci, String nombre) {
		super(mediator);
		this.ci = ci;
		this.nombre = nombre;
	}

	public int getNumMatricula() {
		return ci;
	}

	public void setNumMatricula(int numMatricula) {
		this.ci = numMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Mensaje recibido por: " + nombre + " > " + message);
		System.out.println("INFO > con cedula de identidad: " + ci);
	}
}
