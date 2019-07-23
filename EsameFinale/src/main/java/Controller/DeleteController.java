package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.CompagniManager;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/deleteCompagno")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String matricola = request.getParameter("matricola");
		CompagniManager cm = new CompagniManager();
		cm.deleteCompagno(matricola);
		response.sendRedirect(response.encodeRedirectURL("elencoCompagni"));
	}

}
