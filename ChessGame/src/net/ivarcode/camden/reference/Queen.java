package net.ivarcode.camden.reference;

import java.awt.image.BufferedImage;

public class Queen extends Piece {
	
	public Queen(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
		setID("Queen");
		setPointValue(9);
	}

}
