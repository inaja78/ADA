package com.ada.modelo;

import java.sql.Date;

public class Agendamento {
	
	private Cliente cliente;
	private Operador operador;
	private Date dataAtendimento;
	private Date dataAgendamento;
	private String turnoAgendamento;
	private String situacao;
	
	public Agendamento(){
		cliente = new Cliente();
		operador = new Operador(0);	
				
	}
	
	public Agendamento(Cliente cliente, Operador operador){
		this.cliente = cliente;
		this.operador = operador;			
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Operador getOperador() {
		return operador;
	}
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	public Date getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public Date getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	public String getTurnoAgendamento() {
		return turnoAgendamento;
	}
	public void setTurnoAgendamento(String turnoAgendamento) {
		this.turnoAgendamento = turnoAgendamento;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	

}
