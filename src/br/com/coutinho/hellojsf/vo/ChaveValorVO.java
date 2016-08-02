package br.com.coutinho.hellojsf.vo;

import java.io.Serializable;

public class ChaveValorVO implements Serializable {

	private static final long serialVersionUID = 6474772190402034518L;
	
	private String chave;
	private String valor;
	
	public ChaveValorVO() {
		//Empty constructor
	}
	
	public ChaveValorVO(String chave, String valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public String getChave() {
		return chave;
	}
	
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	

}
