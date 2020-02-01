package TicTacToe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/GameController")
public class GameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException {
		  super.init(config);
		
//		  TicTacToeBean tic = new TicTacToeBean();
//		  int MoveCounter = 0;
//    	  getServletContext().setAttribute( "tic", tic);
//    	  getServletContext().setAttribute( "MoveCounter", MoveCounter);
    	  	
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TicTacToeBean tic = new TicTacToeBean();
		int MoveCounter = 0;
		
		if(request.getSession().getAttribute("tic")==null||request.getSession().getAttribute("MoveCounter")==null) {
			request.getSession().setAttribute("tic", tic);
			request.getSession().setAttribute("MoveCounter", MoveCounter);
		}
		request.getRequestDispatcher("GameView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
