import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompraTest {

	@Test
	void compraAVista() {
		
		Compra compra = new Compra(500);
		assertEquals(1, compra.getNumeroParcelas());
		assertEquals(500, compra.getValorParcela());
		assertEquals(500, compra.getValorTotal());
		
	}
	
	@Test
	void compraAPrazo() {
		
		Compra compra = new Compra(4,250);
		assertEquals(4, compra.getNumeroParcelas());
		assertEquals(250, compra.getValorParcela());
		assertEquals(1000, compra.getValorTotal());
		
	}

}
