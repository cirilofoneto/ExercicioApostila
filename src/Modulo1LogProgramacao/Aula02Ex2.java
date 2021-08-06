package Modulo1LogProgramacao;

import java.util.Scanner;

public class Aula02Ex2 {
	public static void main(String args[]) {

		/*
		 * Um funcionário da ONG exercício anterior realiza o trabalho de buscar
		 * alimentos diariamente no Mercado Municipal utilizando um carro. É importante
		 * que a ONG saiba quantos quilômetros por litro esse carro faz. Crie um
		 * programa em que o usuário digite quantos quilômetros o painel do carro mostra
		 * no inicío de uma viagem, quantos quilômetros ele mostra na chegada ao posto
		 * de gasolina e quantos litros foram reabestecidos. O programa deve calcular e
		 * ebibir média de quilômetros por litro que o veículo faz.
		 *  
		 */
		Scanner pega = new Scanner(System.in);
		
		int quilometrosPainel = 0;
		int quilometrosPosto = 0;
		double litrosAbastecidos = 0;
		double mediaLitros = 0;
		
		System.out.println("Qtos KM o painel mostra inicio da viagem");
		quilometrosPainel = pega.nextInt();
		
		System.out.println("Qtos KM o painel mostra na hora do asbastecimento");
		quilometrosPosto = pega.nextInt();
		
		System.out.println("Quantos litros foi abastecido");
		litrosAbastecidos = pega.nextDouble();
		
		
		mediaLitros = (quilometrosPosto - quilometrosPainel) / litrosAbastecidos;
		
		System.out.println("Em media o carro fez: " + mediaLitros + " KM por Litro");
		
		
		
						
		
		
		
		
		
		
		

	}
}
