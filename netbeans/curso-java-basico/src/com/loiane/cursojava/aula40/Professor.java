package com.loiane.cursojava.aula40;

public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;
	private String xxxxxxxxxxxxxxxxxxxxxxx;
	
	public String getXxxxxxxxxxxxxxxxxxxxxxx() {
		return xxxxxxxxxxxxxxxxxxxxxxx;
	}
	public void setXxxxxxxxxxxxxxxxxxxxxxx(String xxxxxxxxxxxxxxxxxxxxxxx) {
		this.xxxxxxxxxxxxxxxxxxxxxxx = xxxxxxxxxxxxxxxxxxxxxxx;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido(){
		return 0;
	}
		
	public String obterEtiquetaEndereco(){

		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		
		return s;
	}
}
