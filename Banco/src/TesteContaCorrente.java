import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaCorrente {
	
	ContaCorrente cc;
	
	@Before
	public void incio() {
		cc = new ContaCorrente();
		cc.depositar(200);	
	}

	@Test
	public void deposito() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		assertEquals(cc.saldo,200);
	}

	@Test
	public void saque() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorsacado = cc.sacar(50);
		assertEquals(cc.saldo,150);
		assertEquals(valorsacado, 50);
	}
	
	@Test
	public void saqueMaiorqueSaldo() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorsacado = cc.sacar(250);
		assertEquals(cc.saldo,200);
		assertEquals(valorsacado,0);
		
	}
}

