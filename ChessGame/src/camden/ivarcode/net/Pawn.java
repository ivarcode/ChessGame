package camden.ivarcode.net;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Pawn extends Piece {
	
	public int pointValue = 1;
	
	public Pawn(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
	}

}
