package segundoParcial.strategy;

import java.util.ArrayList;
import java.util.List;

public class Ordenar1 implements IOrdenar {

	@Override
	public void execute(List<Usuario> u) {
		List<Usuario> aux = new ArrayList<>();
		for (int i = 0; i < u.size(); i++) {
			aux.add(u.get(i));
			if (i + 1 < u.size()) {
				if (u.get(i).getCi() < u.get(i + 1).getCi()) {
					aux.add(i, u.get(i + 1));
				} else {
					aux.add(i + 1, u.get(i + 1));
				}

			}
		}

		for (Usuario usuario : aux) {
			usuario.info();
		}
	}

}
