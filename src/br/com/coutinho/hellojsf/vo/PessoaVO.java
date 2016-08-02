package br.com.coutinho.hellojsf.vo;

import java.io.Serializable;

public class PessoaVO implements Serializable {

	private static final long serialVersionUID = 1658042050596253923L;
	
	private String nome;
	
	private SexoEnum sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}
	
	
	
}
