package com.ada.modelo;

import com.ada.modelo.Admin;
import com.ada.modelo.Operador;

public class Usuario extends Pessoa {
	
	public static final int admin = 0;
	public static final int usuario = 1;

	public Admin adm;
	public Operador ope;

	public Usuario() {
	}

	public Usuario(int type) {
		switch (type) {
		case admin:
			adm = new Admin();
		case usuario:
			ope = new Operador();
		}
	}

	public Admin getAdm() {
		return adm;
	}

	public void setAdm(Admin adm) {
		this.adm = adm;
	}

	public Operador getope() {
		return ope;
	}

	public void setUsuario(Operador ope) {
		this.ope = ope;
	}

}
