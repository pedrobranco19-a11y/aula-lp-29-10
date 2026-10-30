package aula_29_10;

public class Principal {

	public static void main(String[] args) {

		// Criando Uma Pessoa
		Pessoa pessoa = new Pessoa("João da Silva", "(11) 9999-9999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone:" + pessoa.getTelefone());

		// Criando uma pessoa fisica
		PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "(11) 9999-0000", "4563446564", "568725911");
		System.out.println("\nPessoa fisica:");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());

		// Criando uma pessoa Juridica
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11) 9999-0000", "55568725911");
		System.out.println("\nPessoa juridica:");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("Telefone: " + pessoaJuridica.getCnpj());
	}

}
