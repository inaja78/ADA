package com.ada.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ada.modelo.Usuario;

public class UsuarioDAO extends AbstractDAO<Usuario>{
	
	private List<Usuario> listaUsuario =  new ArrayList<Usuario>();
	
	public UsuarioDAO(){
		super();
		listaUsuario = new ArrayList<Usuario>();
		listaUsuario.add(new com.ada.modelo.Usuario());
	}
	
	public List<Usuario> getLista(Usuario usuario){
		try {
			PreparedStatement ptmt = conn.prepareStatement("select * from Usuario where nome like ?");
			ptmt.setString(1, "%" + usuario.getTipo() + "%");
			ResultSet rs = ptmt.executeQuery();
			while (rs.next()) {
				usuario = new Usuario();
				listaUsuario.add(usuario);
			}
			rs.close();
			ptmt.close();
			} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return listaUsuario;
	}
	
	
	public List<Usuario> getLista(){
		return listaUsuario;
	}
	
	public void adicionar(Usuario usuario){
		try {
			PreparedStatement ptmt = conn.prepareStatement("insert into Usuario (id, tipo) values (?, ?)");/* adicionar os insert com as colunas de acordo com o banco*/
			ptmt.setLong(1, usuario.getId()); //VER ESTA QUESTÃO SE A ID ENTRA AQUI
			ptmt.setString(1, usuario.getTipo());
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
    			throw new RuntimeException(e);
		}
		listaUsuario.add(usuario);		
	}
	
	public void remover(Usuario usuario){
		try{
			PreparedStatement ptmt = conn.prepareStatement("delete from Usuario where id = ?");
			ptmt.setLong(1, usuario.getId());
			ptmt.executeUpdate();
			ptmt.close();
        }catch(Exception e){
        	throw new RuntimeException(e);
        }
		
	}
	
	public void altera(Usuario usuario){
		try{
			PreparedStatement ptmt = conn.prepareStatement("UPDATE Usuario SET id=?, tipo=? WHERE id=?");
			ptmt.setLong(1, usuario.getId());
			ptmt.setString(2, usuario.getTipo());
			ptmt.executeUpdate();
			ptmt.close();
        }catch(Exception e){
        	throw new RuntimeException(e);
        }
		
	}

}
