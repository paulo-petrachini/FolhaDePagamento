package model;

public class Comissionado extends Funcionario {
	private float salarioBase;
	private float comissao;
	
	public Comissionado(String nome, String numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	@Override
	public float calcularSalario() {
		return this.salarioBase = this.salarioBase + (this.salarioBase*comissao/100f);
		}
	
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
}
