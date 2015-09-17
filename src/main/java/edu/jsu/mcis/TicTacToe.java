package edu.jsu.mcis;
import java.util.Scanner;
public class TicTacToe {
	public enum Mark{X_Mark, O_Mark, Empty}
	public enum status{xWin, oWin, active, tie}
	public enum turn{xTurn, oTurn}
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
	else return '_';
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
		
		if( getMark(0,0)=='X'&&
			getMark(0,1)=='X'&&
			getMark(0,2)=='X'){
				return status.xWin;
			}
		else if(getMark(1,0)=='X'&&
				getMark(1,1)=='X'&&
				getMark(1,2)=='X'){
					return status.xWin;
				}
		else if(getMark(2,0)=='X'&&
				getMark(2,1)=='X'&&
				getMark(2,2)=='X'){
					return status.xWin;
				}
		else if(getMark(0,0)=='X'&&
				getMark(1,0)=='X'&&
				getMark(2,0)=='X'){
					return status.xWin;
				}
		else if(getMark(0,1)=='X'&&
				getMark(1,1)=='X'&&
				getMark(2,1)=='X'){
					return status.xWin;
				}
		else if(getMark(0,2)=='X'&&
				getMark(1,2)=='X'&&
				getMark(2,2)=='X'){
					return status.xWin;
				}
		else if(getMark(0,0)=='X'&&
				getMark(1,1)=='X'&&
				getMark(2,2)=='X'){
					return status.xWin;
				}
		else if(getMark(0,2)=='X'&&
				getMark(1,1)=='X'&&
				getMark(2,0)=='X'){
					return status.xWin;
				}
		else if(getMark(0,0)=='O'&&
				getMark(0,1)=='O'&&
				getMark(0,2)=='O'){
					return status.oWin;
				}
		else if(getMark(1,0)=='O'&&
				getMark(1,1)=='O'&&
				getMark(1,2)=='O'){
					return status.oWin;
				}
		else if(getMark(2,0)=='O'&&
				getMark(2,1)=='O'&&
				getMark(2,2)=='O'){
					return status.oWin;
				}
		else if(getMark(0,0)=='O'&&
				getMark(1,0)=='O'&&
				getMark(2,0)=='O'){
					return status.oWin;
				}
		else if(getMark(0,1)=='O'&&
				getMark(1,1)=='O'&&
				getMark(2,1)=='O'){
					return status.oWin;
				}
		else if(getMark(0,2)=='O'&&
				getMark(1,2)=='O'&&
				getMark(2,2)=='O'){
					return status.xWin;
				}
		else if(getMark(0,0)=='O'&&
				getMark(1,1)=='O'&&
				getMark(2,2)=='O'){
					return status.oWin;
				}
		else if(getMark(0,2)=='O'&&
				getMark(1,1)=='O'&&
				getMark(2,0)=='O'){
					return status.oWin;
				}
		else{
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
}





	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		boolean play = true;
		while(play == true){
			System.out.println("\nTic-Tac-Toe\n");
			TicTacToe t = new TicTacToe();
                        status currentStatus = t.getStatus();
			int turnCount = 0;
                        if(currentStatus==status.active){
                            while(currentStatus==status.active){
				t.printBoard();
				if(turnCount==0){
					System.out.print("\nX's turn. Enter position (row col): ");
					int row = userIn.nextInt();
					int col = userIn.nextInt();
					t.setMark(row,col,'X');
					turnCount++;
				}
				else{
					System.out.print("\nO's turn. Enter position (row col): ");
					int row = userIn.nextInt();
					int col = userIn.nextInt();
					t.setMark(row,col,'O');
					turnCount--;
				}
                                currentStatus = t.getStatus();
                            }
                            if(currentStatus==status.xWin){
                                    System.out.println("\nX Wins!");
                                }
                            else if(currentStatus==status.oWin){
                                    System.out.println("\nO Wins!");
                                }
                            else if(currentStatus==status.tie){
                                	System.out.println("\nScratch!");
                                }
                        }

			System.out.println("Play again?(y/n)");
			char response = userIn.next().charAt(0);
			if(response=='n'||response=='N'){
				play = false;
			}
                        }
                }
}
                        