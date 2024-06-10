package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Criando o arraylist
		ArrayList<String> setCores = new ArrayList<>();

		// imports do Scanner
		Scanner sc = new Scanner(System.in);

		// setFrutas.add("Abacate"); exemplo para jogar valor dentro do objeto

		// declaração de variaveis
		String palavra = "";

		System.out.println("Digite todas as cores que deseja e SAIR para encerrar\n\n");

		// CAPTURA DE DADOS
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			palavra = sc.nextLine();

			// jogando o valor digitado para dentro do arrayList
			setCores.add(palavra);
		}
		
		//System.out.println(setCores); printrando o arrayList inteiro
		
		//printando um de cada vez caso cor não seja null
		for(String cor : setCores) {
			if (cor != null)
				System.out.println("\n" + cor);
		}
		
		//Ordenando em ordem  - como nas instruções do exercicio
		Collections.sort(setCores);
		
		//printando o arraylist ordenado
		for(String cor : setCores) {
			if (cor != null)
				System.out.println("\n" + cor);
		}
		
		sc.close();
	}

}
