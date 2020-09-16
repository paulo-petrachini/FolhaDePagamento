package model;

public abstract class Funcionario {
	protected String nome;
	protected String numeroRegistro;
	
	public Funcionario(String nome, String numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	
	}
	
	public abstract float calcularSalario();
	
	public String toString() {
		return "Nome:   "+nome+" Número de Registro:   "+numeroRegistro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	
}
