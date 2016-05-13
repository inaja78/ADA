package com.ada.modeloTestes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ada.modelo.Admin;
import com.ada.modelo.Operador;
import com.ada.modelo.Usuario;

public class OperadorTest {

	private Operador objOperador;
	private Admin ad;
	private Usuario user;
	
	@Test
	public void testSetAd() {
		this.objOperador = new Operador(0);
		this.objOperador.ad = ad;
		this.objOperador.setAd(ad);
		assertEquals(ad, this.objOperador.getAd());
	}

	@Test
	public void testSetUsuario() {
		this.objOperador = new Operador(1);
		this.objOperador.user = user;
		this.objOperador.setUsuario(user);
		assertEquals(user, this.objOperador.getAd());
	}

}
