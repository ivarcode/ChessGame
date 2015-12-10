package camden.ivarcode.net.piece;

import java.awt.image.BufferedImage;

import camden.ivarcode.net.Location;

public class King extends Piece {
	
	public King(Location loc, String color, BufferedImage img) {
		super(loc, color, img);
		setID("King");
		setHasMoved(false);
	}

}
