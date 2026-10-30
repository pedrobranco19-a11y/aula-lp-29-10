package aula_29_10;

public class Gerente extends Funcionario {

	private String beneficios;
	private double premiacao;

	public Gerente(String nome, String cpf, double salario, String cargo, String departamento, String beneficios,
			double premiacao) {
		super(nome, cpf, salario, cargo, departamento);
		this.beneficios = beneficios;
		this.premiacao = premiacao;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public double getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(double premiacao) {
		this.premiacao = premiacao;
	}

}
