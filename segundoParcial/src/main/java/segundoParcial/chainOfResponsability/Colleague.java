package segundoParcial.chainOfResponsability;

public abstract class Colleague {
	protected IChat mediator;

	public Colleague(IChat mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String message);

	public abstract void messageReceived(String message);
}
