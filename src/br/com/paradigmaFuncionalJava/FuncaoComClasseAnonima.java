package br.com.paradigmaFuncionalJava;

public class FuncaoComClasseAnonima {

	public static void main(String[] args) {
		
		Funcao f = new Funcao() {
			
			@Override
			public String gerar(String valor) {
				return valor;
			}
		
		};
		System.out.println(f.gerar("Sr. "+ "João"));
	}

}
