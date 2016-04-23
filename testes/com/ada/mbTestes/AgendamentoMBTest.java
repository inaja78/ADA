package com.ada.mbTestes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ada.mb.AgendamentoMB;
import com.ada.modelo.Agendamento;



public class AgendamentoMBTest {
	private AgendamentoMB objAgendamentoMB;
	private Agendamento objAgendamento;
	private List<Agendamento> objAgendas;
	//private Cliente objCliente;
	
	

	@Test
	public void testSalvarAgendamento() {
		//this.objAgendamentoMB.salvarAgendamento(objAgendamento); //Não soube fazer esse
		assertEquals("sucesso", this.objAgendamentoMB.toString());
	}

	@Test
	public void testRemoverAgendamento() {
		this.objAgendamentoMB.removerAgendamento(objAgendamento); //Não soube fazer esse
		assertEquals("sucesso", this.objAgendamentoMB.toString());
	}

	@Test
	public void testSetAgendamento() {
		this.objAgendamentoMB.setAgendamento(objAgendamento);
		assertEquals(objAgendamento, this.objAgendamentoMB.getAgendamento());
	}

	@Test
	public void testSetAgendas() {
		this.objAgendamentoMB.setAgendas(objAgendas); 
		assertEquals(objAgendas, this.objAgendamentoMB.getAgendas());
		
	}

	@Test
	public void testSetErro() {
		this.objAgendamentoMB.setErro("erro");
		assertEquals("erro", this.objAgendamentoMB.getErro());
	}

}
