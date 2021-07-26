package br.com.paradigmaFuncionalJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComposicaodeFuncoes {

	public static void main(String[] args) {
		
		int [] valores = {1,2,3,4};
		int valor = 0;
		
		
		//array
		Arrays.stream(valores)
		.filter(numero -> numero % 2 == 0)
		.map(numero -> numero * 2)
		.forEach(numero -> System.out.println(numero));
		
		
		List <Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		
		//Lista
		number.stream().filter(numero -> numero % 2 == 0).map(numero -> numero * 2)
				.forEach(numero -> System.out.println(numero));
		
//		for (int i = 0; i < valores.length; i++) {
//			if(valores[i] % 2 == 0) {
//				valor = valores[i] * 2;
//				if(valor != 0) {
//					System.out.println(valor);
//				}
//			}
//			
//		}

	}

}