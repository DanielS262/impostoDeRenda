package model;

import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;

public class Funcionario {

	
	private int matricula;
	private String nome_completo;
	private Date data_desligamento;
	private double ultimo_salario;
	
	
	
	
	public Funcionario() {
		
	}

	public Funcionario(int matricula, String nome_completo, Date data_desligamento, double ultimo_salario) {
		
		this.matricula = matricula;
		this.nome_completo = nome_completo;
		this.data_desligamento = data_desligamento;
		this.ultimo_salario = ultimo_salario;
	}
	
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public Date getData_desligamento() {
		return data_desligamento;
	}

	public void setData_desligamento(Date data_desligamento) {
		this.data_desligamento = data_desligamento;
	}

	public double getUltimo_salario() {
		return ultimo_salario;
	}

	public void setUltimo_salario(double ultimo_salario) {
		this.ultimo_salario = ultimo_salario;
	}
	
	
	public JSONObject toJSON() {
		
		JSONObject json = new JSONObject();
		
		try {
			
			json.put("matricula", matricula);
			json.put("nome_completo", nome_completo);
			json.put("data_desligamento", data_desligamento);
			json.put("ultimo_salario", ultimo_salario);
			
		} catch (JSONException e) {

			e.printStackTrace();
		}
		
		return json;
	}
	
	
	
}
