package segundoParcial.memento;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Saver {
	private Map<String, Memento> stateSaved = new HashMap<>();
	private Originator originator;
	private List<Archivo> archivo = new ArrayList<>();

	public Saver(Originator originator) {
		this.setOriginator(originator);
	}

	public void agregarArchivo(Archivo archivo) {
		if (archivo.getContenido().split(" ").length >= 5) {
			this.archivo.add(archivo);
			originator.setState(archivo);
			addMemento("version" + this.archivo.size(), originator.createMemento());
		}
	}

	public void addMemento(String version, Memento memento) {
		stateSaved.put(version, memento);
	}

	public Memento getMemento(String version) {
		return stateSaved.get(version);
	}

	public Originator getOriginator() {
		return originator;
	}

	public void setOriginator(Originator originator) {
		this.originator = originator;
	}

	public List<Archivo> getArchivo() {
		return archivo;
	}

	public void setArchivo(List<Archivo> archivo) {
		this.archivo = archivo;
	}
}
