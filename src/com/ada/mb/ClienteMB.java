package com.ada.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ada.dao.AbstractDAO;
import com.ada.dao.ClienteDAO;
import com.ada.modelo.Cliente;

@ManagedBean(name="clienteBean")
@SessionScoped

public class ClienteMB {
	
	private Cliente cliente;
	private AbstractDAO<Cliente> clienteDAO;
	private List<Cliente> clientes;
	
	private String erro;
	
	public ClienteMB(){
		cliente = new Cliente();
		clienteDAO =  new ClienteDAO();
		setClientes(new ArrayList<Cliente>()); 
	}
	
	public String SalvarCliente(){
		try{
			clienteDAO.adicionar(cliente);
			this.cliente = new Cliente();
		} catch (Exception ex) {
			System.out.println("Erro:" + ex);
			this.erro = ex.getMessage();
			return "erro";
		}		
		return "sucesso"; //string que leva para pagina de cadastro realizado quando for criada	
	}
	
	public String Excluir(Cliente cli){
		try{
			clientes.remove(cli);
			this.cliente = new Cliente();			
		}catch (Exception ex) {
			System.out.println("Erro:" + ex);
			this.erro = ex.getMessage();
			return "erro";
		}
		return "sucesso";//string que leva para pagina de exclusao realizado quando for criada
	}
	
	public String getPesquisar(){
		try{
			this.clientes = clienteDAO.getLista(cliente);
		}catch (Exception ex) {
			System.out.println("Erro:" + ex);
			this.erro = ex.getMessage();
			return "erro";
		}		
		return "pesquisar"; //string que leva para pagina de pesquisa quando for criada
	}
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Cliente> getClientes() {
		cliente = (Cliente) clienteDAO.getLista(cliente);
		return clientes;
	}
	
	public String getIndex(){
		
		return "index";
	}
	
	public String getCadastrar() {

		return "cadastrarCliente";
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
