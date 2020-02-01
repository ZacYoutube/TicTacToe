package TicTacToe;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NewGameController")
public class NewGameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		request.getSession().removeAttribute("tic");
		request.getSession().removeAttribute("MoveCounter");
        TicTacToeBean tic = new TicTacToeBean();
        int MoveCounter = 0;
        request.getSession().setAttribute("tic", tic); 
        request.getSession().setAttribute("MoveCounter", MoveCounter); 
        response.sendRedirect("GameController");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
