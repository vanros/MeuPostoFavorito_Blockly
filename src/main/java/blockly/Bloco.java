package blockly;

import cronapi.*;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var abastecimentos = Var.VAR_NULL;

			public Var call() throws Exception {
				abastecimentos = cronapi.database.Operations.query(Var.valueOf("app.entity.Abastecimento"),
						Var.valueOf("select a.carro From Abastecimento a where a.carro.placa = :placa"),
						Var.valueOf("placa", Var.VAR_NULL));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
