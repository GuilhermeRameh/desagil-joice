package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculadoraCCCTest {
	
	private double delta = 0.05;
	
	@BeforeEach
	public void setUp() {
		CalculadoraCCC calculadoraCCC = new CalculadoraCCC;
	}
	
	@Test
	void testNiobio() {
		double densidadeNiobio = calculadoraCCC.calcula(92.91, 0.143);
		assertEquals(8.57, densidadeNiobio, delta);
	}
	
	void testTungstenio() {
		double densidadeTungstenio = calculadoraCCC.calcula(183.84, 0.137);
		assertEquals(19.28, densidadeTungstenio, delta);
	}
	
	void testLitio() {
		double densidadeLitio = calculadoraCCC.calcula(6.94, 0.152);
		assertEquals(19.28, densidadeLitio, delta);
	}

}
