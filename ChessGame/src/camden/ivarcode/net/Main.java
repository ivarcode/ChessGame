/*
 * Camden I. Wagner
 * Chess Game
 * currently not functioning, chess game designed to be embedded on a webpage
 * (ivarcode.net)
 * project started on October 25 2015
 */

package camden.ivarcode.net;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JApplet;

public class Main extends JApplet {

	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * inactive Global variables
	 * private static String currentDirectory = new File("").getAbsolutePath();
	 */

	private Piece 
	bRook, wRook, 
	bKnight, wKnight, 
	bBishop, wBishop,
	bQueen, wQueen,
	bKing, wKing,
	bPawn, wPawn;
	private static BufferedImage  
	bRooki, wRooki, 
	bKnighti, wKnighti, 
	bBishopi, wBishopi,
	bQueeni, wQueeni,
	bKingi, wKingi,
	bPawni, wPawni;

	public void paint(Graphics g) {
		loadImages();
		loadPieces();
		Board board = new Board(wKing, wQueen, wBishop, wKnight, wRook, wPawn, 
				bKing, bQueen, bBishop, bKnight, bRook, bPawn, g);



		//drawing board
		drawBoard(g);
		//setting up board
		setupBoard(g);


	}

	private void loadPieces() {
		wKing = new King(new Location(0,'e'), "white", wKingi);
		//TODO
	}

	public static void setupBoard(Graphics g) {
		//Rook
		g.drawImage(bRook, sideWidth, topHeight, null);
		g.drawImage(bRook, sideWidth+(sqDim*7), topHeight, null);
		g.drawImage(wRook, sideWidth, topHeight+(sqDim*7), null);
		g.drawImage(wRook, sideWidth+(sqDim*7), topHeight+(sqDim*7), null);
		//Knight
		g.drawImage(bKnight, sideWidth+(sqDim*1), topHeight, null);
		g.drawImage(bKnight, sideWidth+(sqDim*6), topHeight, null);
		g.drawImage(wKnight, sideWidth+(sqDim*1), topHeight+(sqDim*7), null);
		g.drawImage(wKnight, sideWidth+(sqDim*6), topHeight+(sqDim*7), null);
		//Bishop
		g.drawImage(bBishop, sideWidth+(sqDim*2), topHeight, null);
		g.drawImage(bBishop, sideWidth+(sqDim*5), topHeight, null);
		g.drawImage(wBishop, sideWidth+(sqDim*2), topHeight+(sqDim*7), null);
		g.drawImage(wBishop, sideWidth+(sqDim*5), topHeight+(sqDim*7), null);
		//Queen
		g.drawImage(bQueen, sideWidth+(sqDim*3), topHeight, null);
		g.drawImage(wQueen, sideWidth+(sqDim*3), topHeight+(sqDim*7), null);
		//King
		g.drawImage(bKing, sideWidth+(sqDim*4), topHeight, null);
		g.drawImage(wKing, sideWidth+(sqDim*4), topHeight+(sqDim*7), null);
		//Pawn
		for (int i = 0; i < 8; i++) {
			g.drawImage(bPawn, sideWidth+(sqDim*i), topHeight+(sqDim*1), null);
			g.drawImage(wPawn, sideWidth+(sqDim*i), topHeight+(sqDim*6), null);
		}

	}

	public static void loadImages() {
		try {
			bRooki = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Rook.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wRooki = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Rook.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bKnighti = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Knight.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wKnighti = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Knight.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bBishopi = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Bishop.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wBishopi = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Bishop.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bQueeni = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Queen.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wQueeni = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Queen.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bKingi = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_King.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wKingi = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_King.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bPawni = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Pawn.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wPawni = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Pawn.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }

	}

}
