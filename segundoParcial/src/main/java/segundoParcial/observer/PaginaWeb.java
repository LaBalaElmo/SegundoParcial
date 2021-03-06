package segundoParcial.observer;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPagina {
	private List<IPersona> observerList = new ArrayList<>();
	private int usuariosSuscritos = 0;

	public void publicarVideo(String titulo) {
		notifyObserver("Se publico un video con el titulo: " + titulo, "video");
	}

	public void usuariosSuscritos() {
		if (usuariosSuscritos >= 5) {
			notifyObserver("Se suscribieron 5 usuarios", "usuario");
			usuariosSuscritos = 0;
		}
	}
	
	public void hacerPublicacion(String message) {
		notifyObserver("Se hizo una nueva publicacion", "publicacion");
	}
	
	public void publicarImagen(String titulo) {
		notifyObserver("Se publico una imagen con el titulo: " + titulo, "imagen");
	}

	@Override
	public void suscribirse(IPersona observer) {
		observerList.add(observer);
		usuariosSuscritos++;
	}

	@Override
	public void dessuscribirse(IPersona observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver(String message, String categoria) {
		for (IPersona p : observerList) {
			if(p.getCategoria().equals(categoria)) {
				p.update(message);
			}
		}
	}
}
