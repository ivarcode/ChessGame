package camden.ivarcode.net;

import java.awt.Color;
import java.awt.Graphics;

public class Game {

	private Piece currentPiece;
	private String turn;
	private Board board;
	private int sideWidth, topHeight, sqDim;

	public Game(int sW, int tH, int sD) {
		setTurn("white");
		board = new Board();
		this.sideWidth = sW;
		this.topHeight = tH;
		this.sqDim = sD;
	}
	//Getters & Setters
	public String getTurn() {
		return turn;
	}
	public void setTurn(String turn) {
		this.turn = turn;
	}
	public Piece getCurrentPiece() {
		return currentPiece;
	}
	public void setCurrentPiece(Piece currentPiece) {
		this.currentPiece = currentPiece;
	}
	//

	public void play() {
		//TODO	do I need this?	

	}

	public void changeTurn() {
		if (getTurn().equals("white")) {
			setTurn("black");
		} else {
			setTurn("white");
		}
	}

	public void makeMove(Location src, Location dest) {
		// TODO Auto-generated method stub

	}

	public Piece getPiece(Location src) {
		// TODO Auto-generated method stub
		return null;
	}

	public void drawBoard(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.drawRect(sideWidth, topHeight, sqDim*8, sqDim*8);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				g.fillRect(sideWidth+sqDim+(sqDim*2*j), 
						topHeight+(sqDim*2*i), 
						sqDim, sqDim);
				g.fillRect(sideWidth+(sqDim*2*j), 
						topHeight+sqDim+(sqDim*2*i), 
						sqDim, sqDim);
			}
		}
	}
	private void drawPiece(Graphics g) {
		
		
		
	}

}
