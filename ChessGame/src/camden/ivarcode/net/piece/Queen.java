package camden.ivarcode.net.piece;

import java.awt.image.BufferedImage;

import camden.ivarcode.net.Location;
import camden.ivarcode.net.Piece;

public class Queen extends Piece {
	
	public Queen(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
		setID("Queen");
		setPointValue(9);
	}

}
