import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaEspecial extends TesteContaCorrente {

	@Test
	public void saqueMaiorqueSaldo() {
		ContaEspecial cc = new ContaEspecial(100);
		cc.depositar(200);
		
		int valorsacado = cc.sacar(350);
		assertEquals(cc.saldo,200);
		assertEquals(valorsacado,0);
		
	}

}
