package calculadora.operacoes;

import java.util.Scanner;

import calculadora.exceptions.ZeroNumerador;

public class Dividir implements Operador {

	public Dividir() {
		// TODO Auto-generated constructor stub
	}

	public Double calcula(Double num1, Double num2) {
		if( num2 == 0)
			throw new ZeroNumerador("O númerador não pode ser zero");
		// TODO Auto-generated method stub
		return num1 / num2;
	}
	@Override
	public EnumOperacoes getEnumOperador() {
		// TODO Auto-generated method stub
		return EnumOperacoes.DIVISAO;
	}

}
