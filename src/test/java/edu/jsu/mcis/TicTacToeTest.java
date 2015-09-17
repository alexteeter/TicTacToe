package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	private TicTacToe t;
	@Test
	public void testInitialBoardIsEmpty() {
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				assertEquals(' ', t.getMark(row,col));
			}
		}
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		TicTacToe t = new TicTacToe();
		t.setMark(0,2,'X');
		assertEquals('X',t.getMark(0,2));
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		TicTacToe t = new TicTacToe();
		t.setMark(0,0,'X');
		t.setMark(2,0,'X');
		assertEquals('O',t.getMark(2,0));
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		//TicTacToe t = new TicTacToe();
		//t.setMark(0,2,'X');
		//assert(t.setMark(0,2,'O'));
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
	//	TicTacToe t = new TicTacToe();
	//	t.setMark(0,0,'X');
	//	assertEquals(t.status.active, t.getStatus);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		//TicTacToe t = new TicTacToe();
		//t.setMark(0,0,'X');
		//t.setMark(1,0,'O');
		//t.setMark(0,1,'X');
		//t.setMark(1,1,'O');
		//t.setMark(0,2,'X');
		//assertEquals(t.status.xWin, t.getStatus);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
	//	TicTacToe t = new TicTacToe();
	//	t.setMark(0,0,'X');
	//	t.setMark(0,1,'O');
	//	t.setMark(0,2,'X');
	//	t.setMark(1,0,'O');
	//	t.setMark(1,1,'X');
	//	t.setMark(1,2,'O');
	//	t.setMark(2,1,'X');
	//	t.setMark(2,0,'O');
	//	t.setMark(2,2,'X');
	//	assertEquals(t.status.tie, t.getStatus);
	}	
}
