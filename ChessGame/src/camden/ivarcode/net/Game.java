package camden.ivarcode.net;

import java.awt.Graphics;

public class Game {

	private Graphics g;
	private String turn;
	
	public Game(Graphics g) {
		this.g = g;
		setTurn("white");
	}
	
	public void play() {
		//TODO
		
		
		
		
		
		
		
	}

	public String getTurn() {
		return turn;
	}

	public void setTurn(String turn) {
		this.turn = turn;
	}
	
	public void changeTurn() {
		if (getTurn().equals("white")) {
			setTurn("black");
		} else {
			setTurn("white");
		}
	}
	
}
