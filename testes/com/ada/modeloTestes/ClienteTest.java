package com.ada.modeloTestes;

import junit.framework.TestCase;
import org.junit.Test;

import com.ada.modelo.Cliente;

public class ClienteTest extends TestCase  { 
	
	private Cliente objCliente;
	
	protected void SetUp() throws Exception{
		super.setUp();
		this.objCliente = new Cliente();
	}
		
	
	@Test
	public void testSetNis() {
		this.objCliente = new Cliente();
		this.objCliente.setNis("123");
		assertEquals("123", objCliente.getNis());
	}

	@Test
	public void testSetSituacaoCadastral() {
		this.objCliente = new Cliente();
		this.objCliente.setSituacaoCadastral("cadastrado");
		assertEquals("cadastrado", objCliente.getSituacaoCadastral());
	}

}
