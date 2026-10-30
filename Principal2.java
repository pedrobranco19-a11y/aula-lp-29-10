package aula_29_10;

public class Principal2 {

	public static void main(String[] args) {
		// Criando Uma Funcionario
		funcionario funcionario = new funcionario("João da Silva", "4563446564", "R$4.500.00", "Gerente", "Financeiro");
		System.out.println("Funcionario: ");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF:" + funcionario.getCpf());
		System.out.println("Salario:" + funcionario.getSalario());
		System.out.println("Cargo:" + funcionario.getCargo());
		System.out.println("Departamento:" + funcionario.getDepartamento());

		// Criando uma atendente
		atendente atendente = new atendente("Dalva", "4563446444", "R$2.500.00", "Atendente", "Operacional",
		"R$200.00");
		System.out.println("Atendente: ");
		System.out.println("Nome: " + atendente.getNome());
		System.out.println("CPF:" + atendente.getCpf());
		System.out.println("Salario:" + atendente.getSalario());
		System.out.println("Cargo:" + atendente.getCargo());
		System.out.println("Ajuda Custo:" + atendente.getDepartamento());

		// Criando uma Gerente
		gerente gerente = new gerente("Dalva", "4563446444", "R$2.500.00", "Atendente", "Operacional",
		"R$200.00");
		System.out.println("Gerente: ");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF:" + gerente.getCpf());
		System.out.println("Salario:" + gerente.getSalario());
		System.out.println("Cargo:" + atendente.getCargo());
		System.out.println("Ajuda Custo:" + funcionario.getDepartamento());
	}

}
