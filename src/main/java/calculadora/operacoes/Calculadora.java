package calculadora.operacoes;

import java.util.Scanner;

public class Calculadora {
	private Operador operador;

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public Double calcula(Double num1, Double num2) {
		return this.operador.calcula(num1, num2);
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public void selectOperador(String str) {
		switch (str) {
		case "ADICAO":
			this.operador = new Mais();
			break;
		case "SUBTRACAO":
			this.operador = new Menos();
			break;
		case "MULTIPLICACAO":
			this.operador = new Multiplicar();
			break;
		case "DIVISAO":
			this.operador = new Dividir();
			break;
		}
	}

}
