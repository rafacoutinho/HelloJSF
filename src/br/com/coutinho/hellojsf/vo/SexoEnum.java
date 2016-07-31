package br.com.coutinho.hellojsf.vo;

import java.util.ArrayList;
import java.util.List;

public enum SexoEnum {
	
	MASCULINO("Masculino"), FEMININO("Feminino");
	
	SexoEnum(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	public static List<ChaveValorVO> getListaChaves() {
		List<ChaveValorVO> listaChaves = new ArrayList<ChaveValorVO>();
		for (SexoEnum sexo : SexoEnum.values()) {
			listaChaves.add(new ChaveValorVO(sexo.toString(), sexo.getDescricao()));
		}
		return listaChaves;
	}
}
