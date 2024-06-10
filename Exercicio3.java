package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		// criar o Interator
		Set<Integer> numeros = new HashSet<Integer>();

		// declarando variavel
		int num;

		// imports
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 10 números: ");

		// repetindo até o array ter 10 valores
		while (numeros.size() < 10) {
			// ENTRADA DE DADOS
			System.out.print("Valor: ");
			num = sc.nextInt();

			// Verificando se o número é duplicado
			if (!numeros.add(num)) {
				// o Set vai recusar a entrada do valor repetido de qualquer modo e dentro do if
				// só vai avisar
				System.out.println("Valor duplicado!");
			}
		}

		// Exibição dos elementos do Set usando Iterator
		System.out.println("\n Listar dados do Set: ");

		Iterator<Integer> iterator = numeros.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		sc.close();
	}

}
