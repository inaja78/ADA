package com.ada.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ada.modelo.Agendamento;

public class AgendamentoDAO extends AbstractDAO<Agendamento>{
	
	private List<Agendamento> listaAgendamento =  new ArrayList<Agendamento>();
	
	public AgendamentoDAO(){
		
		listaAgendamento = new ArrayList<Agendamento>();
		listaAgendamento.add(new Agendamento());
	}
	
	public List<Agendamento> getLista(Agendamento agendamento){
		try {
			PreparedStatement ptmt = conn.prepareStatement("select * from Agendamento where nome like ?");
			ptmt.setString(1, "%" + agendamento.getDataAgendamento() + "%");
			ResultSet rs = ptmt.executeQuery();
			while (rs.next()) {
				agendamento= new Agendamento();
				listaAgendamento.add(agendamento);
			}
			rs.close();
			ptmt.close();
			} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return listaAgendamento;
	}
	
	public List<Agendamento> getLista(){
		return listaAgendamento;
	}
	
	public void adicionar(Agendamento agendamento){
		try {
			PreparedStatement ptmt = conn.prepareStatement("insert into Agendamento (idcliente, idoperador, dataatendimento, dataagendamento, turno, situacao) values (?, ?, ?, ?, ?, ?)");/* adicionar os insert com as colunas de acordo com o banco*/
			//ptmt.setString(1, agendamento.getOperador()); fazer assim para todos as colunas existem no banco
			ptmt.setLong(1, agendamento.getIdCliente());
			ptmt.setLong(2, agendamento.getIdOperador());
			ptmt.setDate(3, agendamento.getDataAtendimento());
			ptmt.setDate(4, agendamento.getDataAgendamento());
			ptmt.setString(5, agendamento.getTurnoAgendamento());
			ptmt.setString(6, agendamento.getSituacao());
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
    			throw new RuntimeException(e);
		}
		listaAgendamento.add(agendamento);		
	}
	
	public void remover(Agendamento agendamento){
		try{
			PreparedStatement ptmt = conn.prepareStatement("delete from Agendamento where dataAgendamento = ?");
			ptmt.setDate(1, agendamento.getDataAgendamento()); 
			ptmt.executeUpdate();
			ptmt.close();
        }catch(Exception e){
        	throw new RuntimeException(e);
        }
		
	}
	
	public void altera(Agendamento agendamento){
		try{
			PreparedStatement ptmt = conn.prepareStatement("UPDATE Usuario SET idcliente=?, idoperador=?, dataatendimento=?, dataagendamento=?, turno=?, situacao=? WHERE id=?");
			ptmt.setLong(1, agendamento.getIdCliente());
			ptmt.setLong(2, agendamento.getIdOperador());
			ptmt.setDate(3, agendamento.getDataAtendimento());
			ptmt.setDate(4, agendamento.getDataAgendamento());
			ptmt.setString(5, agendamento.getTurnoAgendamento());
			ptmt.setString(6, agendamento.getSituacao());
			ptmt.setLong(7, agendamento.getId());
			ptmt.executeUpdate();
			ptmt.close();
        }catch(Exception e){
        	throw new RuntimeException(e);
        }
		
	}

}
