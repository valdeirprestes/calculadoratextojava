package calculadora.operacoes;


public class Mais implements Operador {

	public Mais() {
		// TODO Auto-generated constructor stub
	}

	public Double calcula(Double num1, Double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	@Override
	public EnumOperacoes getEnumOperador() {
		// TODO Auto-generated method stub
		return EnumOperacoes.ADICAO;
	}

}
