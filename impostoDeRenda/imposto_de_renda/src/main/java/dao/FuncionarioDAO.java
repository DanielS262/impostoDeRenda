package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONArray;

import model.Funcionario;

public class FuncionarioDAO {

	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	
	public JSONArray consultaFunc() {
		
		JSONArray ja = new JSONArray();
		
		conn = new ConectaBD().conectaBD();
		
		String sql = "select * from funcionarios";
		
		try {
			
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Funcionario funcionario = new Funcionario();
				
				funcionario.setMatricula(rs.getInt("matricula"));
				funcionario.setNome_completo(rs.getString("nome_completo"));
				funcionario.setData_desligamento(rs.getDate("data_desligamento"));
				funcionario.setUltimo_salario(rs.getDouble("ultimo_salario"));
				
				ja.put(funcionario);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ja;
	}
	
	
}
