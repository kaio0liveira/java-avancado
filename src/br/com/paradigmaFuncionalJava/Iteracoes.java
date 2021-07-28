package br.com.paradigmaFuncionalJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Iteracoes {
	
	public static void main(String[] args) {

		filtrarNomes("Kaio", "Maria","Kaio" ,"João");
		imprimirNomes("Kaio", "Maria","Kaio" ,"João");
		
		List<String> carros = new ArrayList<>();
		
		carros.add("Palio");
		carros.add("Gol");
		carros.add("Virtus");
		carros.add("Voyage");
		
		carros.stream().filter(carro -> carro.startsWith("V"))
								.forEach(carro -> System.out.println(carro));
		
		}
	
	
	public static void filtrarNomes(String... nome) {
		
		List<String> stream = Stream.of(nome).filter(name -> name.equals("Kaio")).collect(Collectors.toList());

		System.out.println("Resultado Stream: " + stream);

		List<String> resultado2 = new ArrayList<>();

		String m = null;
		for (int i = 0; i < nome.length; i++) {
			if (nome[i] == "Kaio") {
				//atribuindo valor a lista, quando a validação for true.
				resultado2.add(nome[i]);
			}
		}
		System.out.println("Resultado Stream: " + resultado2);

	}

	public static void imprimirNomes(String... nome) {

		for (String nomes : nome) {
			System.out.println("FOR: " + nomes);
		}

		Stream.of(nome).forEach(name -> System.out.println("Stream: " + name));

	}
}


