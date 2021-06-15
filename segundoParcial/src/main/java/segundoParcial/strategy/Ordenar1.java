package segundoParcial.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenar1 implements IOrdenar {

	@Override
	public void execute(List<Usuario> u) {
		Collections.sort(u, new Comparator<Usuario>() {
			@Override
			public int compare(Usuario o1, Usuario o2) {
				if (o1.getCi() > o1.getCi()) {
					return 1;
				}else {
					return -1;
				}
			}
		});
	}

}