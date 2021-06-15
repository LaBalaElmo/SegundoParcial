package segundoParcial.strategy;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
	private IOrdenar strategy;
	private List<Usuario> l = new ArrayList<>();

	public BaseDeDatos() {
	}

	public IOrdenar getStrategy() {
		return strategy;
	}

	public void setStrategy(IOrdenar strategy) {
		this.strategy = strategy;
	}

	public void addUsuario(Usuario u) {
		l.add(u);
	}

	public void execute() {
		this.strategy.execute(l);
	}
}
