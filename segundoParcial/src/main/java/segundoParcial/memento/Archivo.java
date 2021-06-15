package segundoParcial.memento;

public class Archivo {
	private int version;
	private String contenido;

//	(o1, o2) -> o1.getCodigo().compareTo(o2.getCodigo()));
//
//	//Clase anónima
//	Collections.sort(listaCalles, new Comparator<Calle>() {
//	    @Override
//	    public int compare(Calle o1, Calle o2) {
//	        return o1.getCodigo().compareTo(o2.getCodigo());
//	    }
//	});

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
