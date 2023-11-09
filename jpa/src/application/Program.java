package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa pessoaOne = new Pessoa(1, "Ricardo Ferreira", "ricardo@ferreiras.dev.br");
		Pessoa pessoaTwo = new Pessoa(2, "Ricardo Ferreira", "rnhc1000@gmail.com");
		System.out.println(pessoaOne);
		System.out.println(pessoaTwo);
	}

}
