package net.ivarcode.camden.reference;

import java.awt.image.BufferedImage;

public class Bishop extends Piece {
	
	public Bishop(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
		setID("Bishop");
		setPointValue(3);
	}

}