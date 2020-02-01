package TicTacToe;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PlayController")
public class PlayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("position"));
	    TicTacToeBean tic = (TicTacToeBean)request.getSession().getAttribute("tic");
	    int MoveCounter = (int)request.getSession().getAttribute("MoveCounter");
	   
//	    System.out.println(counter);	
	   
	    if(MoveCounter%2==0&&tic.getGameBoard()[i]=='-'){
	    	   	
	        tic.getGameBoard()[i] = 'X';
	    	    	
	    	MoveCounter++;
	    	
	    	
	    }
	    else if(MoveCounter%2==1&&tic.getGameBoard()[i]=='-') {
	    	
	    	tic.getGameBoard()[i] = 'O';
	    	    	
	    	MoveCounter++;
	    	
	    }
	    
	    request.getSession().setAttribute("MoveCounter", MoveCounter);
  	  
		response.sendRedirect("GameController");
	   
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
