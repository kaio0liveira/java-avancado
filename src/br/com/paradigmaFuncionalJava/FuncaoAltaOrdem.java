package br.com.paradigmaFuncionalJava;

public class FuncaoAltaOrdem {

	public static void main(String[] args) {
		Calculo SOMA = (a,b) ->  a+b;
		Calculo SUBTRACAO = (a,b) ->  a-b;
		Calculo DIVISAO = (a,b) ->  a/b;
		Calculo MULT = (a,b) ->  a*b;
		
		
		System.out.println(executarOperacao(SOMA, 10, 10)); 
		System.out.println(executarOperacao(SUBTRACAO, 10, 10)); 
		System.out.println(executarOperacao(DIVISAO, 10, 10)); 
		System.out.println(executarOperacao(MULT, 10, 10)); 
		
	}
	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
}

interface Calculo{
	int calcular(int a, int b);
}