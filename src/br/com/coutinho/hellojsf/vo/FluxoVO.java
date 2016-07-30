package br.com.coutinho.hellojsf.vo;

import java.io.Serializable;

public class FluxoVO implements Serializable {

	private static final long serialVersionUID = 4308731869011568813L;
	
	private PessoaVO pessoa;

	public PessoaVO getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaVO pessoa) {
		this.pessoa = pessoa;
	}

}
