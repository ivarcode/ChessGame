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
	public Piece getPiece(Location src) {
		return board.getPiece(src);
	}
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
		System.out.println("making move");
	}

	public void drawBoard(Graphics g) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				drawSquare(g, new Location(i,j));
			}
		}
		g.setColor(Color.BLACK);
		g.drawRect(sideWidth, topHeight, sqDim*8, sqDim*8);
	}
	public void drawPiece(Graphics g, Location loc) {
		if (getPiece(loc) != null) {
			g.drawImage(getPiece(loc).getImg(), 
					sideWidth+(sqDim*loc.getFileByInt()), 
					topHeight+(sqDim*(7-loc.getRank())), 
					null);
		}
	}
	public void drawPieceAt(Graphics g, Location loc, Location newloc) {
		if (getPiece(loc) != null) {
			g.drawImage(getPiece(loc).getImg(), 
					sideWidth+(sqDim*newloc.getFileByInt()), 
					topHeight+(sqDim*(7-newloc.getRank())), 
					null);
		}
	}
	public void drawSquare(Graphics g, Location loc) {
		if ((loc.getFileByInt()+loc.getRank())%2 == 0) {
			g.setColor(Color.DARK_GRAY);
		} else {
			g.setColor(Color.WHITE);
		}
		g.fillRect(sideWidth+(sqDim*loc.getFileByInt()), 
				topHeight+(sqDim*(7-loc.getRank())), 
				sqDim, sqDim);
	}
	public void drawSquareTinted(Graphics g, Location loc) {
		if ((loc.getFileByInt()+loc.getRank())%2 == 0) {
			g.setColor(Color.YELLOW); // to change
		} else {
			g.setColor(Color.YELLOW); // to change
		}
		g.fillRect(sideWidth+(sqDim*loc.getFileByInt()), 
				topHeight+(sqDim*(7-loc.getRank())), 
				sqDim, sqDim);
	}

}
