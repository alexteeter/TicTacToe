import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	private TicTacToe t;
	public void startNewGame() {
		t = new TicTacToe();
	}
	
	public void markLocation(int row, int col) {
		TicTacToe.Mark m = t.getMark(row,col);
	}
	
	public String getMark(int row, int col) {
		TicTacToe.Mark m =t.getMark(row,col);
		if(m==TicTacToe.Mark.X_Mark) return "X";
		else if(m==TicTacToe.Mark.O_Mark) return "O";
		else return " ";
	}
    
	public String getStatus() {
		return "";
	}
}
