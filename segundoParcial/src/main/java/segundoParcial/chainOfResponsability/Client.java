package segundoParcial.chainOfResponsability;

public class Client {
	public static void main(String[] args) {
		ChatEscolar chat = new ChatEscolar();
		
		Estudiante e = new Estudiante(chat, 1, "Juan");
		Estudiante e1 = new Estudiante(chat, 2, "Juan1");
		
		Docente d = new Docente(chat, 1, "Pedro");
		Docente d1 = new Docente(chat, 2, "Pedro1");
		
		Administrativo a = new Administrativo(chat, "director", "Jose");
		Administrativo a1 = new Administrativo(chat, "director1", "Jose1");
		
		chat.addAdministrativo(a);
		chat.addAdministrativo(a1);
		chat.addDocente(d);
		chat.addDocente(d1);
		chat.addEstudiante(e);
		chat.addEstudiante(e1);
		
		e.send("hola", "administrativo");
		System.out.println("***********");
		e.send("hola", "docente");
		System.out.println("***********");
		e.send("Hola a todos");
		
		d.send("Hola como estan");
		
		a.send("prueba");
	}
}
