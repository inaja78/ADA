package com.ada.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ada.modelo.Agendamento;

@ManagedBean(name="agendamentoBean")
@SessionScoped

public class AgendamentoMB {
	
	private Agendamento agendamento;
	private List<Agendamento> agendas;
	
	private String erro;
	
	public AgendamentoMB(){
		agendamento = new Agendamento();
		setAgendas(new ArrayList<Agendamento>());		
	}
	
	public String salvarAgendamento(){
		try{
			//aguarda implementação
		} catch (Exception ex) {
			System.out.println("Erro:" + ex);
			this.setErro(ex.getMessage());
			return "erro";
		}		
		return "sucesso"; //string que leva para pagina de cadastro realizado quando for criada	
	}
	
	public String removerAgendamento(Agendamento ag){
		try{
			agendas.remove(ag);
			this.agendamento = new Agendamento();			
		}catch (Exception ex) {
			System.out.println("Erro:" + ex);
			this.erro = ex.getMessage();
			return "erro";
		}
		return "sucesso";//string que leva para pagina de exclusao realizado quando for criada
	}
	
	public String getPesquisar(){
		try{
			// this.agendas = agendamentoDAO.getLista(agendamento); Acredito que deve ficar assim
		}catch (Exception ex) {
			System.out.println("Erro:" + ex);
			this.erro = ex.getMessage();
			return "erro";
		}		
		return "pesquisar"; //string que leva para pagina de pesquisa quando for criada
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agen) {
		this.agendamento = agen;
	}

	public List<Agendamento> getAgendas() {
		//agendas = agendamentoDAO.getLista(agendamento); quando criar o DAO descomentar
		return agendas;
	}

	public void setAgendas(List<Agendamento> agendas) {
		this.agendas = agendas;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

}
