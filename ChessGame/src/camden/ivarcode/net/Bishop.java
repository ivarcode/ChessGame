package camden.ivarcode.net;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Bishop extends Piece {
	
	public int pointValue = 3;
	
	public Bishop(Location loc, String color, BufferedImage img, Graphics g) {
		super(loc, color, img, g);
	}

}
