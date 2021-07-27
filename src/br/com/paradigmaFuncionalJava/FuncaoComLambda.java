package br.com.paradigmaFuncionalJava;

public class FuncaoComLambda {
	public static void main(String[] args) {
		Funcao p = valor -> "Sr. "+valor;
		
		System.out.println(p.gerar("João"));
	}
}
