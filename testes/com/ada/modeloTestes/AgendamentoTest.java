package com.ada.modeloTestes;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Test;

import com.ada.modelo.Agendamento;
import com.ada.modelo.Cliente;
import com.ada.modelo.Operador;

public class AgendamentoTest {
	private Agendamento objAgendamento;
	private Cliente cliente;
	private Operador op;
	
	@Test
	public void testSetCliente() {
		this.objAgendamento = new Agendamento();
		this.objAgendamento.setCliente(cliente);
		assertEquals(cliente, this.objAgendamento.getCliente());
	}

	@Test
	public void testSetOperador() {
		this.objAgendamento = new Agendamento();
		this.objAgendamento.setOperador(op);
		assertEquals(op, this.objAgendamento.getOperador());
	}

	@Test
	public void testSetDataAtendimento() {
		this.objAgendamento = new Agendamento();
		this.objAgendamento.setDataAtendimento(new Date(2010,01,01)); // Para o teste estamos usando essa classe defasada :/
		assertEquals(2010/01/01, this.objAgendamento.getDataAtendimento());
	}

	@Test
	public void testSetDataAgendamento() {
		this.objAgendamento = new Agendamento();
		this.objAgendamento.setDataAgendamento(new Date(2010,01,01)); // Para o teste estamos usando essa classe defasada :/
		assertEquals(2010/01/01, this.objAgendamento.getDataAgendamento());
	}

	@Test
	public void testSetTurnoAgendamento() {
		this.objAgendamento = new Agendamento();
		this.objAgendamento.setTurnoAgendamento("tarde");
		assertEquals("tarde", this.objAgendamento.getTurnoAgendamento());
	}

	@Test
	public void testSetSituacao() {
		this.objAgendamento = new Agendamento();
		this.objAgendamento.setSituacao("cadastrado");
		assertEquals("cadastrado", this.objAgendamento.getSituacao());
	}

}
