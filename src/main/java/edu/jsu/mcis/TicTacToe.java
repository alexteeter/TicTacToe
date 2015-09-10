package edu.jsu.mcis;

public class TicTacToe {
	public enum Mark{X_Mark, O_Mark, Empty}
	public enum status{xWin, oWin, active, tie}
	private Mark[][] board;

	public TicTacToe(){
	board = new Mark[3][3];
	for(int row = 0; row< board.length;row++){
		for(int col = 0; col < board.length; col++){
		board[row][col]=Mark.Empty;
		}
	}
	}
public char getMark(int row, int col){
	if(board[row][col]==Mark.X_Mark) return 'X';
	else if(board[row][col]==Mark.O_Mark) return 'O';
	else return ' ';
}
public void setMark(int row, int col, char newMark){
	if(board[row][col]==Mark.Empty){
		if(newMark=='X')
			board[row][col]=Mark.X_Mark;
		else if(newMark=='O')
			board[row][col]=Mark.O_Mark;
		else	
			board[row][col]=Mark.Empty;
		}
	}
public void printBoard(){
	for(int row=0;row<3;row++){
		System.out.println();
		for (int col=0;col<3;col++){
			System.out.print(getMark(row,col)+" ");
		}
	}
}
	public status getStatus() {
		
		int emptyCount = 0;
		for(int row=0;row<3;row++){
			for(int col=0;col<3;col++){
				if(getMark(row,col)!=' ')
					emptyCount++;
			}
		}
		if(emptyCount==0)
			return status.tie;
		else
			return status.active;
}





	public static void main(String[] args) {

	}
}