package br.com.paradigmaFuncionalJava;

import java.util.function.Function;

public class Funcoes {

	public static void main(String[] args) {
		
		Function<String,String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
		System.out.println(retornarNomeAoContrario.apply("Kaio"));
		Function<String,Integer> CpnverteStringParaInteiro = numero -> (Integer.valueOf(numero))*2 ;
		System.out.println(CpnverteStringParaInteiro.apply("4"));
		
		
	}

}
