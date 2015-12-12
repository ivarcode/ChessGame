package net.ivarcode.camden.reference;

import java.awt.image.BufferedImage;

public class Pawn extends Piece {
	
	public Pawn(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
		setID("Pawn");
		setPointValue(1);
	}
	
	public Pawn() {
		//null constructor
	}

}
