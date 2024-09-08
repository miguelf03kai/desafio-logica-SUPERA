package br.com.miguelf03kai;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		System.out.println(Funcoes.valoresOrganizados("---------\n"
														+ "1 | 2 | 3\n"
														+"---------\n"
														+ "4 | 5 | 6\n"
														+"---------\n"
														+ "7 | 8 | 9\n"
														+"---------\n"
														));
		
		System.out.println(Funcoes.valoresOrganizados("---------\n"
														+ "1 | 2 | 3\n"
														+"---------\n"
														+ "4 | 10 | 12\n"
														+"---------\n"
														+ "6 | 7 | 33\n"
														+"---------\n"
														));
		
		
		System.out.println(Funcoes.valoresOrganizados("---------\n"
														+ "1 | 2 | 3 | 1\n"
														+"---------\n"
														+ "4 | 5 | 6 | 4\n"
														+"---------\n"
														+ "7 | 8 | 9 | 7\n"
														+"---------\n"
														+ "7 | 8 | 9 | 7\n"
														));
		System.out.println(Funcoes.valoresOrganizados("---------\n"
														+ "A | B | C | D\n"
														+"---------\n"
														+ "L | M | N | E\n"
														+"---------\n"
														+ "K | P | O | F\n"
														+"---------\n"
														+ "J | I | H | G\n"
														));
	}

}
