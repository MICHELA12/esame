package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.CompagniManager;
import Model.Compagni;

/**
 * Servlet implementation class ListaCompagni
 */
@WebServlet("/elencoCompagni")
public class ListaCompagni extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaCompagni() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		CompagniManager cm = new CompagniManager();
		List<Compagni> compagni = cm.selectCompagni();
		System.out.println("passo da qui" + compagni);
		request.setAttribute("elencoCompagni", compagni);
		request.getRequestDispatcher("/ListaCompagni.jsp").forward(request, response);
	}

}
