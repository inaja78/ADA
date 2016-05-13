package com.ada.modelo;

import java.sql.Date;

public class Agendamento {
	
	private long id;
	private long idCliente;
	private long idOperador;
	private Date dataAtendimento;
	private Date dataAgendamento;
	private String turnoAgendamento;
	private String situacao;

	public Agendamento() {
	}

	public Agendamento(long id, long idCliente, long idOperador, Date dataAtendimento, Date dataAgendamento,
			String turnoAgendamento, String situacao) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idOperador = idOperador;
		this.dataAtendimento = dataAtendimento;
		this.dataAgendamento = dataAgendamento;
		this.turnoAgendamento = turnoAgendamento;
		this.situacao = situacao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(long idOperador) {
		this.idOperador = idOperador;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
