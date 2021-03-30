package br.edu.insper.desagil.joice.model;


public class CalculadoraCCC extends Calculadora{

	public CalculadoraCCC() {
		super("CCC");
	}

	@Override
	public double calcula(double peso, double raio) {
		double massa = (2*peso)/(6.023*Math.pow(10, 23));
		double aresta = (4*raio*Math.pow(10, -7))/Math.sqrt(3);
		double volume = Math.pow(aresta, 3);
		return massa/volume;
	}

}
