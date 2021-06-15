package segundoParcial.strategy;

public class Usuario {
	private int ci;
	private String nombre;
	private int fechaNacimiento;
	private String profesion;

	public Usuario(int ci, String nombre, int fechaNacimiento, String profesion) {
		this.ci = ci;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.profesion = profesion;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public void info() {
		System.out.println("*****DATOS********");
		System.out.println("CI: " + ci);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		System.out.println("Profesion: " + profesion);
	}

}
