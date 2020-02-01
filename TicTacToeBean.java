package TicTacToe;


public class TicTacToeBean {

	private char[] gameBoard = new char[9];
    static int Xwin = 0;
    static int Owin = 0;
	public TicTacToeBean() {
		for(int i = 0;i<gameBoard.length;i++) {
			gameBoard[i] = '-';
		}
	}

	public char[] getGameBoard() {
		return gameBoard;
	}

	public boolean getGameOver() {
		if(getIsWinnerX()== true||getIsWinnerO()==true||getIsDraw()==true) 
			return true;
		else
			return false;
	}

	public boolean getIsWinnerO() {
		if((gameBoard[0] == 'O' && gameBoard[1] == 'O' && gameBoard[2] == 'O')
				 ||(gameBoard[0] == 'O' && gameBoard[4] == 'O' && gameBoard[8] == 'O')		
				 ||(gameBoard[0] == 'O' && gameBoard[3] == 'O' && gameBoard[6] == 'O')	
				 ||(gameBoard[3] == 'O' && gameBoard[4] == 'O' && gameBoard[5] == 'O')	
				 ||(gameBoard[6] == 'O' && gameBoard[7] == 'O' && gameBoard[8] == 'O')
				 ||(gameBoard[2] == 'O' && gameBoard[4] == 'O' && gameBoard[6] == 'O')	
				 ||(gameBoard[1] == 'O' && gameBoard[4] == 'O' && gameBoard[7] == 'O')	
				 ||(gameBoard[2] == 'O' && gameBoard[5] == 'O' && gameBoard[8] == 'O')) {
//					System.out.println("Player O won!");
			        Owin++;
					return true;
				}
		return false;
	}
	public boolean getIsWinnerX() {
		if((gameBoard[0] == 'X' && gameBoard[1] == 'X' && gameBoard[2] == 'X')
		 ||(gameBoard[0] == 'X' && gameBoard[4] == 'X' && gameBoard[8] == 'X')		
		 ||(gameBoard[0] == 'X' && gameBoard[3] == 'X' && gameBoard[6] == 'X')	
		 ||(gameBoard[3] == 'X' && gameBoard[4] == 'X' && gameBoard[5] == 'X')	
		 ||(gameBoard[6] == 'X' && gameBoard[7] == 'X' && gameBoard[8] == 'X')
		 ||(gameBoard[2] == 'X' && gameBoard[4] == 'X' && gameBoard[6] == 'X')	
		 ||(gameBoard[1] == 'X' && gameBoard[4] == 'X' && gameBoard[7] == 'X')	
		 ||(gameBoard[2] == 'X' && gameBoard[5] == 'X' && gameBoard[8] == 'X')) {
//			System.out.println("Player X won!");
			Xwin++;
			return true;
		}
	
		return false;
	}
	
	public boolean getIsDraw() {
		if(getIsWinnerX()==false && getIsWinnerO()==false && NoDash()==true) {
			return true;
		}
		return false;
	}
	public int getX() {
		return Xwin++;
	}
	public int getO() {
		return Owin++;
	}
	
	//helper method to determine if the gameBoard array contains '-' character.
	
	public boolean NoDash() {
		if (!(new String(gameBoard).contains("-"))) {
		    return true;
		}
		else {
			return false;
		}
	}
	
	
 
}