package com.ada.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ada.modelo.Cliente;

@ManagedBean(name="clienteBean")
@SessionScoped

public class ClienteMB {
	
	private Cliente cliente;
	private List<Cliente> clientes;
	
	private String erro;
	
	public ClienteMB(){
		cliente = new Cliente();
		setClientes(new ArrayList<Cliente>()); 
	}
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Cliente> getClientes() {
		//clientes = clienteDAO.getLista(cliente); quando criar o DAO descomentar
		return clientes;
	}
	
	public String getIndex(){
		
		return "index";
	}
	
	public void setCliente(Cliente clie){
		
		this.cliente = clie;
	}
	
	public Cliente getCliente(){
		
		return cliente;
	}
	
	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}
}
