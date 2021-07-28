package br.com.paradigmaFuncionalJava;

import java.util.function.Supplier;

public class Suplidores {

	public static void main(String[] args) {
		
		Supplier<Pessoa> instanciaPessoa = () -> new Pessoa("Maria",40);
		System.out.println(instanciaPessoa.get());
	}

}
class Pessoa{
	
	private String nome;
	private Integer idade;
	
	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
}
