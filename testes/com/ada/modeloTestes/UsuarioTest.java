package com.ada.modeloTestes;

import java.util.Date;

import org.junit.Test;

import com.ada.modelo.Usuario;

import junit.framework.TestCase;

public class UsuarioTest extends TestCase{
	
	private Usuario objUsuario; 
	
	@Test
	public void testSetId() {
		this.objUsuario = new Usuario();
		this.objUsuario.setId(0);
		assertEquals(0, this.objUsuario.getId());
	}

	@Test
	public void testSetNome() {
		this.objUsuario = new Usuario();
		this.objUsuario.setNome("Maria");
		assertEquals("Maria", this.objUsuario.getNome());
	}

	@Test
	public void testSetRg() {
		this.objUsuario = new Usuario();
		this.objUsuario.setRg("47.546.789");
		assertEquals("47.546.789", this.objUsuario.getRg());
	}

	@Test
	public void testSetCpf() {
		this.objUsuario = new Usuario();
		this.objUsuario.setCpf("123.456.789-00");
		assertEquals("123.456.789-00", this.objUsuario.getCpf());
	}

	@Test
	public void testSetEndereco() {
		this.objUsuario = new Usuario();
		this.objUsuario.setEndereco("endereco");
		assertEquals("endereco", this.objUsuario.getEndereco());
	}

	@Test
	public void testSetTelefone() {
		this.objUsuario = new Usuario();
		this.objUsuario.setTelefone("4584-6942");
		assertEquals("4584-6942", this.objUsuario.getTelefone());
	}

	@Test
	public void testSetDataNascimento() {
		this.objUsuario = new Usuario();
		this.objUsuario.setDataNascimento(new Date(2010,01,01)); // Não estou sabendo como passar a data como paramêtro :/
		assertEquals(2010/01/01, this.objUsuario.getDataNascimento());
	}

	@Test
	public void testSetSexo() {
		this.objUsuario = new Usuario(); 
		this.objUsuario.setSexo("masculino");
		assertEquals("masculino", this.objUsuario.getSexo());
	}

	@Test
	public void testSetTipo() {
		this.objUsuario = new Usuario();
		this.objUsuario.setTipo("1");
		assertEquals("1", this.objUsuario.getTipo());
	}

}
