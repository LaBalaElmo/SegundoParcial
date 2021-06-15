package segundoParcial.memento;

public class Memento {
	private Archivo state;

    public Memento(Archivo stateSaved){
        this.state=stateSaved;
    }

    public Archivo getState() {
        return state;
    }
}
