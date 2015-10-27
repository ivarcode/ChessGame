/*
 * Camden I. Wagner
 * Chess Game
 * project started on October 25 2015
 */

package camden.ivarcode.net;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JApplet;

public class Main extends JApplet {
	
	private static String currentDirectory = new File("").getAbsolutePath();
	private static int sqDim = 75;
	private static int sideWidth = 150;
	private static int topHeight = 50;
	private static BufferedImage 
		bRook, wRook, 
		bKnight, wKnight, 
		bBishop, wBishop,
		bQueen, wQueen,
		bKing, wKing,
		bPawn, wPawn;

	public void paint(Graphics g) {
		
		g.setColor(Color.BLACK);
		loadImages();
		//drawing board
		drawBoard(g);
		//setting up board
		setupBoard(g);
		
		
	}
	
	public static void drawBoard(Graphics g) {
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
	
	public static void setupBoard(Graphics g) {
		//Rook
		g.drawImage(bRook, 0, 0, null);
		//Knight
		
		//Bishop
		
		//Queen
		
		//King
		
		//Pawn
		
	}
	
	public static void loadImages() {
		try {
			bRook = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Rook.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wRook = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Rook.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bKnight = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Knight.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wKnight = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Knight.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bBishop = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Bishop.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wBishop = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Bishop.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bQueen = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Queen.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wQueen = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Queen.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bKing = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_King.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wKing = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_King.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			bPawn = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/b_Pawn.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		try {
			wPawn = ImageIO.read(new URL(
					"http://www.ivarcode.net/apps/chessgame/assets/w_Pawn.png"));
		} catch (IOException e) {
			System.out.println("ERROR: img not found"); }
		
	}
	
}
