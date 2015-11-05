package camden.ivarcode.net.piece;

import java.awt.image.BufferedImage;

import camden.ivarcode.net.Location;
import camden.ivarcode.net.Piece;

public class Rook extends Piece {
	
	public Rook(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
		setID("Rook");
		setPointValue(5);
	}

}