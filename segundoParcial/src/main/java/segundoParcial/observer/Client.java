package segundoParcial.observer;

public class Client {
	public static void main(String[] args) {
		PaginaWeb pagina = new PaginaWeb();
		Persona p1 = new Persona("Juan1", "usuario");
		Persona p2 = new Persona("Juan2", "usuario");
		Persona p3 = new Persona("Juan3", "video");
		Persona p4 = new Persona("Juan4", "video");
		Persona p5 = new Persona("Juan5", "publicacion");
		Persona p6 = new Persona("Juan6", "publicacion");
		Persona p7 = new Persona("Juan7", "imagen");
		Persona p8 = new Persona("Juan8", "imagen");

		pagina.suscribirse(p1);
		pagina.suscribirse(p2);
		pagina.suscribirse(p3);
		pagina.suscribirse(p4);
		pagina.suscribirse(p5);
		pagina.suscribirse(p6);
		pagina.suscribirse(p7);
		pagina.suscribirse(p8);

		pagina.publicarImagen("Gatos");
		pagina.publicarVideo("gatos bonitos");
		
		pagina.hacerPublicacion("Hola como estan");
		
		pagina.usuariosSuscritos();
		pagina.usuariosSuscritos();
		
		pagina.suscribirse(p1);
		pagina.suscribirse(p1);
		pagina.suscribirse(p1);
		pagina.suscribirse(p1);
		pagina.suscribirse(p1);
		pagina.usuariosSuscritos();
	}
}
