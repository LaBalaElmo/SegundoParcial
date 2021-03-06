package segundoParcial.chainOfResponsability;

public class Estudiante extends Colleague {
	private int numMatricula;
	private String nombre;

	public Estudiante(IChat mediator, int numMatricula, String nombre) {
		super(mediator);
		this.numMatricula = numMatricula;
		this.nombre = nombre;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void send(String message, String to) {
		mediator.send(message, to);
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Mensaje recibido por: " + nombre + " > " + message);
		System.out.println("INFO > con matricula: " + numMatricula);
	}
}
