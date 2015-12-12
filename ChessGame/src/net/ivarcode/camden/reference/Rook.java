package net.ivarcode.camden.reference;

import java.awt.image.BufferedImage;

public class Rook extends Piece {
	
	public Rook(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
		setID("Rook");
		setPointValue(5);
		setHasMoved(false);
	}

}
