package segundoParcial.chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class ChatEscolar implements IChat {
	private List<Estudiante> estudiantes = new ArrayList<>();
	private List<Docente> docentes = new ArrayList<>();
	private List<Administrativo> administrativo = new ArrayList<>();

	public void addEstudiante(Estudiante e) {
		estudiantes.add(e);
	}

	public void addDocente(Docente d) {
		docentes.add(d);
	}

	public void addAdministrativo(Administrativo a) {
		administrativo.add(a);
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public List<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}

	public List<Administrativo> getAdministrativo() {
		return administrativo;
	}

	public void setAdministrativo(List<Administrativo> administrativo) {
		this.administrativo = administrativo;
	}

	public void send(String message, String to) {
		if (to.equals("docente")) {
			for (Docente d : docentes) {
				d.messageReceived(message);
			}
		}
		if (to.equals("administrativo")) {
			for (Administrativo a : administrativo) {
				a.messageReceived(message);
			}
		}
	}

	@Override
	public void send(String message, Colleague colleague) {
		if (colleague instanceof Estudiante) {
			for (Estudiante e : estudiantes) {
				if (e != colleague) {
					e.messageReceived(message);
				}
			}
			for (Administrativo a : administrativo) {
				a.messageReceived(message);
			}
			for (Docente d : docentes) {
				d.messageReceived(message);
			}
		}

		if (colleague instanceof Docente) {
			for (Docente d : docentes) {
				if (d != colleague) {
					d.messageReceived(message);
				}
			}
			for (Estudiante e : estudiantes) {
				e.messageReceived(message);
			}
		}

		if (colleague instanceof Administrativo) {
			for (Docente d : docentes) {
				d.messageReceived(message);
			}
			for (Estudiante e : estudiantes) {
				e.messageReceived(message);
			}
			for (Administrativo a : administrativo) {
				if (a != colleague) {
					a.messageReceived(message);
				}
			}

		}

	}
}
