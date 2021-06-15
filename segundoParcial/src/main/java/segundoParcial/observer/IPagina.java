package segundoParcial.observer;

public interface IPagina {
	void suscribirse(IPersona observer);
    void dessuscribirse(IPersona observer);
    void notifyObserver(String message, String categoria);
}
