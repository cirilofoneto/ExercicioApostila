package Modulo1LogProgramacao;

import java.util.Scanner;

public class Aula01Ex1 {

	public static void main(String[] args) {

		/*
		 * Ocasionalmente a ONG para qual você trabalha recebe doaçoes em dólar e
		 * precisa saber qual é o valor em reais. Crie um programa que permita que o
		 * usuário digite o valor da doação em dólares, converta esse valor para reasi e
		 * exiba o resultado na tela.
		 * 
		 */
		
		Scanner pega = new Scanner(System.in);
		double cotacaoDolar = 0;
		double dolar = 0;
		double reais = 0;
		
		System.out.println("Qual valor recebido em dolar");
		dolar = pega.nextDouble();
		
		System.out.println("Qual cotação do dolar?");
		cotacaoDolar = pega.nextDouble();
		
		reais = dolar * cotacaoDolar;
		
		System.out.println("Valor convertido em reais: " + reais);
		
	}

}
