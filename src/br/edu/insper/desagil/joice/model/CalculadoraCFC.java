package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {

	public CalculadoraCFC() {
		super("CFC");
	}

	@Override
	public double calcula(double peso, double raio) {
		double massa = (4*peso)/(6.023*Math.pow(10, 23));
		double aresta = 2*raio*Math.pow(10, -7)*Math.sqrt(2);
		double volume = Math.pow(aresta, 3);
		return massa/volume;
	}

}
