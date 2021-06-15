package segundoParcial.chainOfResponsability;

public class Administrativo extends Colleague {
	private String cargo;
	private String nombre;

	public Administrativo(IChat mediator, String cargo, String nombre) {
		super(mediator);
		this.cargo = cargo;
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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
		System.out.println("INFO > con cargo: " + cargo);
	}
}
