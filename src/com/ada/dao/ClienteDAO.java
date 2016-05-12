package  com.ada.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ada.modelo.Cliente;

public class ClienteDAO extends AbstractDAO<Cliente>{
	
	private List<Cliente> listaCliente =  new ArrayList<Cliente>();
	
	public ClienteDAO(){
		super();
		listaCliente =  new ArrayList<Cliente>();
		listaCliente.add(new Cliente());
	}
	
	public List<Cliente> getLista(Cliente cliente){
		try {
			PreparedStatement ptmt = conn.prepareStatement("select * from Cliente where nome like ?");
			ptmt.setString(1, "%" + cliente.getCpf() + "%");
			ResultSet rs = ptmt.executeQuery();
			while (rs.next()) {
				cliente = new Cliente();
				listaCliente.add(cliente);
			}
			rs.close();
			ptmt.close();
			} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return listaCliente;
	}
	
	
	public List<Cliente> getLista(){
		return listaCliente;
	}
	
	public void adicionar(Cliente cliente){
		try {
			PreparedStatement ptmt = conn.prepareStatement("insert into Cliente (id, nis, situacaocadastral) values ()");/* adicionar os insert com as colunas de acordo com o banco*/
			//ptmt.setString(1, cliente.getCpf()); fazer assim para todos as colunas existem no banco
			ptmt.setLong(1, cliente.getId()); //VER ESTA QUESTÃO SE A ID ENTRA AQUI
			ptmt.setString(2, cliente.getNis());
			ptmt.setString(3, cliente.getSituacaoCadastral());
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
    			throw new RuntimeException(e);
		}
		listaCliente.add(cliente);		
	}
	
	public void remover(Cliente cliente){
		try{
			PreparedStatement ptmt = conn.prepareStatement("delete from Cliente where nis = ?");
			ptmt.setString(1, cliente.getNis());
			ptmt.executeUpdate();
			ptmt.close();
        }catch(Exception e){
        	throw new RuntimeException(e);
        }
		
	}
	
	public void altera(Cliente cliente){
		try{
			PreparedStatement ptmt = conn.prepareStatement("UPDATE Cliente SET nis=?, situacaocadastral=? WHERE id=?");
			ptmt.setString(1, cliente.getNis());
			ptmt.setString(2, cliente.getSituacaoCadastral());
			ptmt.setLong(7, cliente.getId());
			ptmt.executeUpdate();
			ptmt.close();
        }catch(Exception e){
        	throw new RuntimeException(e);
        }
		
	}

}
