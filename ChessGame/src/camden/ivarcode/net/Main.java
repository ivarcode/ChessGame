/*
 * Camden I. Wagner
 * Chess Game
 * currently not functioning, chess game designed to be embedded on a webpage
 * (ivarcode.net)
 * project started on October 25 2015
 */

package camden.ivarcode.net;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.*;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JApplet;

import camden.ivarcode.net.piece.Bishop;
import camden.ivarcode.net.piece.King;
import camden.ivarcode.net.piece.Knight;
import camden.ivarcode.net.piece.Pawn;
import camden.ivarcode.net.piece.Piece;
import camden.ivarcode.net.piece.Queen;
import camden.ivarcode.net.piece.Rook;

public class Main extends JApplet {

	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * inactive Global variables
	 * private static String currentDirectory = new File("").getAbsolutePath();
	 */

	private boolean refresh_full_board;
	private static int sqDim = 60;
	private static int sideWidth = 150;
	private static int topHeight = 50;
	private Piece clickedPiece;
	private Game game;
	private Location src, dest;
	private Location old_dest;
	boolean inDrag = false;
	int mouseX, mouseY;

	public void init() {

		refresh_full_board = true;
		game = new Game(sideWidth, topHeight, sqDim);
		refresh_full_board = false;

		addMouseListener(new MouseAdapter() {
			int a = -1000, b = -1000;
			int c = -1000, d = -1000;
			Piece nullPiece = new Piece();

			public void mousePressed(MouseEvent e) {
				// Obtain mouse coordinates at time of press.
				int x = e.getX ();
				int y = e.getY ();

				if (x < sideWidth) {
					//do nothing mouse off screen
				} else if (x < sideWidth+(sqDim*8)) {
					a = x-sideWidth;
					a = a/sqDim;
				} else {
					//do nothing as of now
				}
				if (y < topHeight) {
					//do nothing mouse off screen
				} else if (y < topHeight+(sqDim*8)) {
					b = y-topHeight;
					b = b/sqDim;
					//flips board so that 0,0 is in bottom left corner
					b = 7-b;
				} else {
					//do nothing as of now
				}
				
				if (a < 8 && a > -1 && b < 8 && b > -1) {
					src = new Location(a,b);
					dest = src;
					old_dest = src;
					Piece nullPiece = new Piece();
					if (game.getPiece(src) != null) {
						clickedPiece = game.getPiece(src);
					} else {
						clickedPiece = nullPiece;
					}
				}
				inDrag = true;
			}
			public void mouseReleased(MouseEvent e)
			{
				if (game.makeMove(new Move(src,dest))) {
					inDrag = false;
					repaint();
					inDrag = true;
				}

				a = -1000;
				b = -1000; 
				c = -1000;
				d = -1000;
				clickedPiece = nullPiece;
				
				repaint();

				// When mouse is released, clear inDrag (to
				// indicate no drag in progress) if inDrag is
				// already set.
				if (inDrag)
					inDrag = false;

			}
		});
		// Attach a mouse motion listener to the applet. That listener listens
		// for mouse drag events.
		addMouseMotionListener (new MouseMotionAdapter ()
		{
			public void mouseDragged (MouseEvent e)
			{
				if (inDrag)
				{
					int a = -1000, b = -1000;
					int x = e.getX();
					int y = e.getY();
					
					if (x < sideWidth) {
						//do nothing mouse off screen
					} else if (x < sideWidth+(sqDim*8)) {
						a = x-sideWidth;
						a = a/sqDim;
					} else {
						//do nothing as of now
					}
					if (y < topHeight) {
						//do nothing mouse off screen
					} else if (y < topHeight+(sqDim*8)) {
						b = y-topHeight;
						b = b/sqDim;
						//flips board so that 0,0 is in bottom left corner
						b = 7-b;
					} else {
						//do nothing as of now
					}
					
					if (a < 8 && a > -1 && b < 8 && b > -1) {
						if (a != dest.getFileByInt() || 
								b != dest.getRank()) {
							old_dest = dest;
							dest = new Location(a,b);
							//System.out.println(a + " " + b);
							repaint();
						}
					}
					
				}
			}
		});
	}

	public void paint(Graphics g) {
		if (inDrag) {
			updateSquares(g);
		} else {
			//System.out.println("PAINTING NOW");
			Dimension d = getSize();
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, d.width, d.height);
			game.drawBoard(g);
			drawPieces(g);
		}
	}
	private void drawPieces(Graphics g) {
		Location loc;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				loc = new Location(i,j);
				if (game.getPiece(loc) != null) {
					game.drawPiece(g, new Location(i,j));
				}
			}
		}
	}

	public void updateSquares(Graphics g) {
		game.drawSquare(g, old_dest);
		game.drawSquareTinted(g, dest);
		game.drawPiece(g, old_dest);
		game.drawSquare(g, src);
		game.drawPieceAt(g, src, dest);
	}
}
