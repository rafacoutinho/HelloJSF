package br.com.coutinho.hellojsf.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.coutinho.hellojsf.vo.ChaveValorVO;
import br.com.coutinho.hellojsf.vo.FluxoVO;
import br.com.coutinho.hellojsf.vo.PessoaVO;
import br.com.coutinho.hellojsf.vo.SexoEnum;

@ManagedBean(name = "fluxoController")
@SessionScoped
public class FluxoController implements Serializable {

	private static final long serialVersionUID = -9206464954181821593L;
	
	private Integer passo;
	private FluxoVO fluxo;
	private List<ChaveValorVO> listaChavesSexo;
	
	public FluxoController() {
		System.out.println("Fluxo Iniciado!");
		fluxo = new FluxoVO();
		fluxo.setPessoa(new PessoaVO());
		setListaChavesSexo(SexoEnum.getListaChaves());
		passo = 1;
	}
	
	public String proximaPagina() {
		passo++;
		System.out.println("Nome: " + getFluxo().getPessoa().getNome());
		System.out.println("Sexo: " + getFluxo().getPessoa().getSexo().getDescricao());
		return "passo" + passo.toString();
	}
	
	public String paginaAnterior() {
		passo--;
		System.out.println("Nome: " + getFluxo().getPessoa().getNome());
		System.out.println("Sexo: " + getFluxo().getPessoa().getSexo().getDescricao());
		return "passo" + passo.toString();
	}

	public Integer getPasso() {
		System.out.println("PASSO " + passo.toString());
		return passo;
	}

	public FluxoVO getFluxo() {
		return fluxo;
	}

	public void setFluxo(FluxoVO fluxo) {
		this.fluxo = fluxo;
	}

	public List<ChaveValorVO> getListaChavesSexo() {
		return listaChavesSexo;
	}

	public void setListaChavesSexo(List<ChaveValorVO> listaChavesSexo) {
		this.listaChavesSexo = listaChavesSexo;
	}
	
}
