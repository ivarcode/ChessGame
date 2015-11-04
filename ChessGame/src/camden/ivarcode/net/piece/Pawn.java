package camden.ivarcode.net.piece;

import java.awt.image.BufferedImage;

import camden.ivarcode.net.Location;
import camden.ivarcode.net.Piece;

public class Pawn extends Piece {
	
	public Pawn(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
		setID("Pawn");
		setPointValue(1);
	}

}
