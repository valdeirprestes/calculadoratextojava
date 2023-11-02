package calculadora.application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import calculadora.exceptions.ZeroNumerador;
import calculadora.operacoes.Calculadora;
import calculadora.operacoes.EnumOperacoes;

public class App {

	public static void main(String[] argc) {
		// TODO Auto-generated constructor stub
		Double num1, num2;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList();
		Integer i, opcao;
		Calculadora calc = new Calculadora();
		System.out.println("Calculadora Simples feita em java");
		while (true) {
			try {
				do {
					i = 0;
					for (EnumOperacoes e : EnumOperacoes.values()) {
						i++;
						System.out.println(i + " - " + e.getDesc());
						lista.add(e.name());
					}
					lista.add("Sair");
					i += 1;
					System.out.println(i + " - Sair");
					System.out.printf("Escreva com a operação desejada:");
					opcao = sc.nextInt();
				} while (opcao < 0 || opcao > i);
				
				
				if ( opcao == i )
					break;
				calc.selectOperador(lista.get(opcao - 1));
				System.out.printf("Entre com o primeiro número:");
				num1 = sc.nextDouble();
				System.out.printf("Entre com o segundo número:");
				num2 = sc.nextDouble();
				System.out.println("Resultado do cálculo é " + calc.calcula(num1, num2));

			} catch (ZeroNumerador e) {
				System.out.println("Error : não existe divisão por zero , NAN");
			} catch (InputMismatchException e) {
				System.out.println("Entre apenas com numeros no menu ou valores com pontos para calcular");
				sc.next();
			}

		}
	}

}
