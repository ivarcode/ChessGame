package camden.ivarcode.net;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import camden.ivarcode.net.piece.*;

public class Board {

	private Image wKingi, bKingi, wQueeni, bQueeni, wBishopi, bBishopi,
	wKnighti, bKnighti, wRooki, bRooki, wPawni, bPawni;

	public Board(Piece[] pieces) {
		loadPieceImages();
		
		
		//TODO
	}

	private void loadPieceImages() {
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
	private Piece[] loadPieces() {
		Piece[] pieces = new Piece[32];

		pieces[0] = new King(new Location('e',0), "white", wKingi);
		pieces[1] = new Queen(new Location('d',0), "white", wQueeni);
		pieces[2] = new Bishop(new Location('c',0), "white", wBishopi);
		pieces[3] = new Bishop(new Location('f',0), "white", wBishopi);
		pieces[4] = new Knight(new Location('b',0), "white", wKnighti);
		pieces[5] = new Knight(new Location('g',0), "white", wKnighti);
		pieces[6] = new Rook(new Location('a',0), "white", wRooki);
		pieces[7] = new Rook(new Location('h',0), "white", wRooki);
		pieces[8] = new Pawn(new Location('a',1), "white", wPawni);
		pieces[9] = new Pawn(new Location('b',1), "white", wPawni);
		pieces[10] = new Pawn(new Location('c',1), "white", wPawni);
		pieces[11] = new Pawn(new Location('d',1), "white", wPawni);
		pieces[12] = new Pawn(new Location('e',1), "white", wPawni);
		pieces[13] = new Pawn(new Location('f',1), "white", wPawni);
		pieces[14] = new Pawn(new Location('g',1), "white", wPawni);
		pieces[15] = new Pawn(new Location('h',1), "white", wPawni);

		pieces[16] = new King(new Location('e',7), "black", bKingi);
		pieces[17] = new Queen(new Location('d',7), "black", bQueeni);
		pieces[18] = new Bishop(new Location('c',7), "black", bBishopi);
		pieces[19] = new Bishop(new Location('f',7), "black", bBishopi);
		pieces[20] = new Knight(new Location('b',7), "black", bKnighti);
		pieces[21] = new Knight(new Location('g',7), "black", bKnighti);
		pieces[22] = new Rook(new Location('a',7), "black", bRooki);
		pieces[23] = new Rook(new Location('h',7), "black", bRooki);
		pieces[24] = new Pawn(new Location('a',6), "black", bPawni);
		pieces[25] = new Pawn(new Location('b',6), "black", bPawni);
		pieces[26] = new Pawn(new Location('c',6), "black", bPawni);
		pieces[27] = new Pawn(new Location('d',6), "black", bPawni);
		pieces[28] = new Pawn(new Location('e',6), "black", bPawni);
		pieces[29] = new Pawn(new Location('f',6), "black", bPawni);
		pieces[30] = new Pawn(new Location('g',6), "black", bPawni);
		pieces[31] = new Pawn(new Location('h',6), "black", bPawni);

		return pieces;
	}

}

