package segundoParcial.strategy;

public class Client {
	public static void main(String[] args) {
		BaseDeDatos b = new BaseDeDatos();
		Usuario u1 = new Usuario(1, "juan", 2, "padre");
		Usuario u2 = new Usuario(6, "pedro", 5, "carpintero");
		Usuario u3 = new Usuario(2, "mauricio", 1, "albanil");
		b.addUsuario(u1);
		b.addUsuario(u2);
		b.addUsuario(u3);
		
		b.setStrategy(new Ordenar1());
		
		b.execute();
		
	}
}
