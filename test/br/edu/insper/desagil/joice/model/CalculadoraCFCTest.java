package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculadoraCFCTest {

	private double delta = 0.05;
	
	@BeforeEach
	public void setUp() {
		CalculadoraCFC calculadoraCFC = new CalculadoraCFC;
	}
	
	@Test
	void testCobre() {
		double densidadeCobre = calculadoraCFC.calcula(63.55, 0.128);
		assertEquals(8.89, densidadeCobre, delta);
	}
	
	void testOuro() {
		double densidadeOuro = calculadoraCFC.calcula(196.97, 0.144);
		assertEquals(19.36, densidadeOuro, delta);
	}
	
	void testPrata() {
		double densidadePrata = calculadoraCFC.calcula(107.87, 0.144);
		assertEquals(10.60, densidadePrata, delta);
	}

}
