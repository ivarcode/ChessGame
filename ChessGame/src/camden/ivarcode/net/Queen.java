package camden.ivarcode.net;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Queen extends Piece {
	
	public int pointValue = 9;
	
	public Queen(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
	}

}
