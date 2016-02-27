package br.com.alvorada.gerenciadordealunos.v2_1_0;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class TecladoTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	
	@Test
	public void testTestarSeAStringPodeSerConvertidaEmNumero() {
		assertFalse(Teclado.testarSeAStringPodeSerConvertidaEmNumero("10naopode"));
		assertTrue(Teclado.testarSeAStringPodeSerConvertidaEmNumero("10"));

	}

}
