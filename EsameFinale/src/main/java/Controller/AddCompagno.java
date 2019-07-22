package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.CompagniManager;
import Model.Compagni;

/**
 * Servlet implementation class AddCompagno
 */
@WebServlet("/addCompagno")
public class AddCompagno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddCompagno() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		Compagni c = new Compagni();
		c.setMatricola(request.getParameter("id"));
		c.setNome(request.getParameter("nomeC"));
		c.setCognome(request.getParameter("cognomeC"));
		try {
			CompagniManager cm = new CompagniManager();
			cm.addCompagno(c);
			System.out.println("L'HO AGGIUNTO");
		}catch (Exception e) {
			System.out.println("NON L'HO AGGIUNTO");
			// TODO: handle exception
		}
		response.sendRedirect(response.encodeRedirectURL("elencoCompagni"));
}
}