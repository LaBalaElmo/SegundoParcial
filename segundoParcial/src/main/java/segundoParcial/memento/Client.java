package segundoParcial.memento;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Saver saver = new Saver(originator);
		
		Archivo a1 = new Archivo(1, "este documento es una prueba");
		Archivo a2 = new Archivo(2, "el exito solo depende de tu esfuerzo");
		Archivo a3 = new Archivo(3, "prologo");
		Archivo a4 = new Archivo(4, "este documento fue actualizado satisfactoriamente");
		
		saver.agregarArchivo(a1);
		saver.agregarArchivo(a2);
		saver.agregarArchivo(a3);
		saver.agregarArchivo(a4);
		
		originator.restoreFromMemento(saver.getMemento("version1"));
		originator.restoreFromMemento(saver.getMemento("version2"));
		originator.restoreFromMemento(saver.getMemento("version3"));
		
	}
}
