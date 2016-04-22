package com.ada.mb;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ada.modelo.Cliente;




public class ClienteMBTest {
	
	private ClienteMB clienteMB;
	private Cliente cliente;
	private List<Cliente> clientes;
	//private String erro;
	
	
	
	@Test
	public void testSetClientes(){
		clienteMB = new ClienteMB();
		clientes = new ArrayList<Cliente>(); 
		this.clienteMB.setClientes(clientes);
		assertEquals(clientes, this.clienteMB.getClientes());
	}

	@Test
	public void testSetCliente() {
		clienteMB = new ClienteMB();
		this.clienteMB.setCliente(cliente);
		assertEquals(cliente, this.clienteMB.getCliente());
	}

	@Test
	public void testSetErro() {
		clienteMB = new ClienteMB();
		this.clienteMB.setErro("Error");
		assertEquals("Error", this.clienteMB.getErro());
	}

}
