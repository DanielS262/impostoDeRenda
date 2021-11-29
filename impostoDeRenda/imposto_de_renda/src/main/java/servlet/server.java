package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import org.json.JSONArray;

import dao.FuncionarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/funcionario")

public class server extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//JSONArray ja = new JSONArray();
		
		PrintWriter pw = resp.getWriter();
		
		//FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		//ja = funcionarioDAO.consultaFunc();
		
		
		pw.write("oi");
		
		
	}
	
	
}
