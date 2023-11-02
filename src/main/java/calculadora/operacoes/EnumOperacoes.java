package calculadora.operacoes;

public enum EnumOperacoes {
	ADICAO("Adição"),
	SUBTRACAO("Subtração"),
	DIVISAO("Divisão"),
	MULTIPLICACAO("Multiplicação");
	
	private String desc;
	EnumOperacoes(String desc) {
		this.desc = desc;
	}
	public String getDesc() { return this.desc;}

}
