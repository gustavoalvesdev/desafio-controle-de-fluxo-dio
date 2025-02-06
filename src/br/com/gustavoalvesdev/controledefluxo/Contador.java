package br.com.gustavoalvesdev.controledefluxo;

import java.util.Scanner;

import br.com.gustavoalvesdev.controledefluxo.exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int primeiroParametro = entrada.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int segundoParametro = entrada.nextInt();
		
		try {
			contar(primeiroParametro, segundoParametro);
		} catch(ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
		entrada.close();

	}
	
	public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
		
		if (primeiroNumero > segundoNumero) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int iteracoes = primeiroNumero - segundoNumero;
		
		for (int i = primeiroNumero; i <= segundoNumero; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
