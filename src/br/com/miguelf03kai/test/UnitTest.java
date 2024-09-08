package br.com.miguelf03kai.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import br.com.miguelf03kai.Funcoes;

class UnitTest {

	@Test
	void corResistorCase1Test() {
		assertEquals("marrom preto preto dourado", Funcoes.corResistor("10 ohms"));
	}

	
	@Test
	void corResistorCase2Test() {
		assertEquals("vermelho vermelho marrom dourado", Funcoes.corResistor("220 ohms"));
	}
	
	@Test
	void corResistorCase3Test() {
		assertEquals("amarelo violeta vermelho dourado", Funcoes.corResistor("4.7k ohms"));
	}
	
	@Test
	void corResistorCase4Test() {
		assertEquals("vermelho preto verde dourado", Funcoes.corResistor("2M ohms"));
	}
	
	@Test
	void snailCase1Test() {
		assertEquals("[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]", Funcoes.valoresOrganizados("---------\n"
																									+ "A | B | C | D\n"
																									+"---------\n"
																									+ "L | M | N | E\n"
																									+"---------\n"
																									+ "K | P | O | F\n"
																									+"---------\n"
																									+ "J | I | H | G\n"
																									));
	}
	
	@Test
	void snailCase2Test() {
		assertEquals("[, , 5, 8, 2, P, K10, L, M8]", Funcoes.valoresOrganizados("---------\n"
																				+ " |  | 5\n"
																				+"---------\n"
																				+ "L | M8 | 8\n"
																				+"---------\n"
																				+ "K10 | P | 2\n"
																				+"---------\n"
																				));
	}
	
	@Test
	void snailCase3Test() {
		assertEquals("[, , , , , ]", Funcoes.valoresOrganizados("---------\n"
																+ " |  | \n"
																+"---------\n"
																+ " |  | \n"
																+"---------\n"
																+ " |  | \n"
																+"---------\n"
																));
	}
	
	
}
