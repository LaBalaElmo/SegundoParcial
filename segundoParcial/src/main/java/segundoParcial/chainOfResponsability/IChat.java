package segundoParcial.chainOfResponsability;

public interface IChat {
	void send( String message, Colleague colleague);
	void send( String message, String to);
}
