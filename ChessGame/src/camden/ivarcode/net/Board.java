package camden.ivarcode.net;

public class Board {

	Piece[][] board = new Piece[8][8];
	
	public Board() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				//TODO
				//initialize empty set of Pieces here?
			}
		}
	}
	
	public Piece getPiece(char rank, int file) {
		int i = -1; //throws error if case not 'a'-'h'
		switch (rank) {
			case 'a':	i = 0;
			case 'b':	i = 1;
			case 'c':	i = 2;
			case 'd':	i = 3;
			case 'e':	i = 4;
			case 'f':	i = 5;
			case 'g':	i = 6;
			case 'h':	i = 7;
		}
		return board[i][file];
	}
	
	public static void movePiece(Piece piece, char orig_rank, int orig_file, 
			char new_rank, int new_file) {
		if (moveAllowed(piece, orig_rank, orig_file, new_rank, new_file)) {
			//TODO move piece			
		}
	}
	
	public boolean moveAllowed(Piece piece, char orig_rank, int orig_file, 
			char new_rank, int new_file) {
		if (getPiece(orig_rank, orig_file) != piece) {
			return false;
		}
		if (!piece.ableToMove(new_rank, new_file)) {
			
		}
		
		return true;
	}
	
}
