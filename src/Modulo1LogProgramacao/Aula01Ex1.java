package Modulo1LogProgramacao;

import java.util.Scanner;

public class Aula01Ex1 {

	public static void main(String[] args) {

		/*
		 * Ocasionalmente a ONG para qual voc� trabalha recebe doa�oes em d�lar e
		 * precisa saber qual � o valor em reais. Crie um programa que permita que o
		 * usu�rio digite o valor da doa��o em d�lares, converta esse valor para reasi e
		 * exiba o resultado na tela.
		 * 
		 */
		
		Scanner pega = new Scanner(System.in);
		double cotacaoDolar = 0;
		double dolar = 0;
		double reais = 0;
		
		System.out.println("Qual valor recebido em dolar");
		dolar = pega.nextDouble();
		
		System.out.println("Qual cota��o do dolar?");
		cotacaoDolar = pega.nextDouble();
		
		reais = dolar * cotacaoDolar;
		
		System.out.println("Valor convertido em reais: " + reais);
		
	}

}
