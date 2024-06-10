package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// imports do Scanner
		Scanner sc = new Scanner(System.in);
				
		// Criando o arraylist
		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		//declarando variaveis
		int valorProcurado;
		
		System.out.println("Informe o valor que deseja encontrar: ");
		valorProcurado = sc.nextInt();
		
		if(numeros.contains(valorProcurado)) {
			System.out.println("Valor informado encontrado na posição: " + numeros.indexOf(valorProcurado));
		}else {
			System.out.println("Valor Não encontrado!");
		}
	
		sc.close();
	}

}
