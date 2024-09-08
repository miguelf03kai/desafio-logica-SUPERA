package br.com.miguelf03kai;

import java.util.Scanner;

public class Resistores {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a resistência desejada: ");
		String entrada = scanner.nextLine();
		System.out.println("Seu resistor deve possuir as litras/faixas: "+Funcoes.corResistor(entrada));
	}
}
