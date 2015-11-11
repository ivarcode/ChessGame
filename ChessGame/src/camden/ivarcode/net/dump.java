package camden.ivarcode.net;

import java.awt.Color;
import java.awt.Graphics;

public class dump {

	
	
	public void drawBoard(Graphics g) {
		//TODO add white square draw
		g.setColor(Color.DARK_GRAY);
		g.drawRect(sideWidth, topHeight, sqDim*8, sqDim*8);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				g.fillRect(sideWidth+sqDim+(sqDim*2*j), 
						topHeight+(sqDim*2*i), 
						sqDim, sqDim);
				g.fillRect(sideWidth+(sqDim*2*j), 
						topHeight+sqDim+(sqDim*2*i), 
						sqDim, sqDim);
			}
		}
	}

	public void drawPieces(Graphics g) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board.getPiece(i,j) != null && clickedPiece != board.getPiece(i, j)) {
					g.drawImage(board.getPiece(i,j).getImg(), 
							sideWidth+(board.getPiece(i,j).getLoc().getFileByInt()*sqDim), 
							topHeight+((7-board.getPiece(i,j).getLoc().getRank())*sqDim), null);
				}
				if (clickedPiece == board.getPiece(i, j)) {
					g.drawImage(board.getPiece(i, j).getImg(), mouseX-(sqDim/2), mouseY-(sqDim/2), null);
				}
			}
		}
	}
	
	
	
}


