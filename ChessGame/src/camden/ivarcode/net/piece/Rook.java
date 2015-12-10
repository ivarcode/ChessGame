package camden.ivarcode.net.piece;

import java.awt.image.BufferedImage;

import camden.ivarcode.net.Location;

public class Rook extends Piece {
	
	public Rook(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
		setID("Rook");
		setPointValue(5);
		setHasMoved(false);
	}

}
