package camden.ivarcode.net;

import java.util.ArrayList;

import camden.ivarcode.net.piece.Bishop;
import camden.ivarcode.net.piece.King;
import camden.ivarcode.net.piece.Knight;
import camden.ivarcode.net.piece.Pawn;
import camden.ivarcode.net.piece.Queen;
import camden.ivarcode.net.piece.Rook;

public class dump {

	/*
	
	
	public void makeMove(Location src, Location dest) {
		if (isLegalMove(src,dest)) {
			System.out.println("isLegalMove");
			changeTurn();
			board.movePiece(src, dest);
			//TODO record move	
			//TODO check for mate
		}
	}

	private boolean isLegalMove(Location src, Location dest) {
		ArrayList<Move> moves = getMoveOptions();
		for (int i = 0; i < moves.size(); i++) {
			if (src.getFile() == moves.get(i).getSrc().getFile() && 
					src.getRank() == moves.get(i).getSrc().getRank() && 
					dest.getFile() == moves.get(i).getDest().getFile() && 
					dest.getRank() == moves.get(i).getDest().getRank()) {
				boardCopy(board,backupBoard);
				board.movePiece(src, dest);
				changeTurn();
				boolean kingInCheck = kingInCheck();
				changeTurn();
				boardCopy(backupBoard,board);
				if (kingInCheck) {
					return false;
				}
				return true;
			}
		}
		return false;
	}

	public ArrayList<Move> getMoveOptions() {
		ArrayList<Move> moves = new ArrayList<Move>();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Location loc = new Location(i,j);
				Piece piece = getPiece(loc);
				if (piece != null && piece.getColor().equals(turn)) {				
					if (piece instanceof King) {
						moves.addAll(kingMoves(loc));
					} else if (piece instanceof Queen) {
						moves.addAll(queenMoves(loc));
					} else if (piece instanceof Bishop) {
						moves.addAll(bishopMoves(loc));
					} else if (piece instanceof Knight) {
						moves.addAll(knightMoves(loc));
					} else if (piece instanceof Rook) {
						moves.addAll(rookMoves(loc));
					} else if (piece instanceof Pawn) {
						moves.addAll(pawnMoves(loc,turn));
					}
				}
			}
		}
		
		//TODO doesn't work
		for (int i = 0; i < moves.size(); i++) {
			board.movePiece(moves.get(i).getSrc(),moves.get(i).getDest());
			boolean kingInCheck = kingInCheck();
			board.takeBack();
			if (kingInCheck) {
				moves.remove(i);
			}
		}
		return moves;
	}

	private boolean kingInCheck() {
		Location loc = null;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (getPiece(new Location(i,j)) instanceof King &&
						getPiece(new Location(i,j)).getColor() == turn) {
					loc = new Location(i,j);
					break;
				}
			}
		}
		if (loc == null) {
			System.out.println("NO [" + turn + "] KING ON BOARD");
			return false;
		}
		int file, rank;
		file = loc.getFileByInt()+1;
		rank = loc.getRank();
		while (file < 8) {
			if (getPiece(new Location(file,rank)) instanceof Queen ||
					getPiece(new Location(file,rank)) instanceof Rook) {
				if (getPiece(new Location(file,rank)).getColor() == turn) {
					break;
				} else {
					return true;
				}
			}
			file++;
		}
		file = loc.getFileByInt()-1;
		rank = loc.getRank();
		while (file > -1) {
			if (getPiece(new Location(file,rank)) instanceof Queen ||
					getPiece(new Location(file,rank)) instanceof Rook) {
				if (getPiece(new Location(file,rank)).getColor() == turn) {
					break;
				} else {
					return true;
				}
			}
			file--;
		}
		file = loc.getFileByInt();
		rank = loc.getRank()+1;
		while (rank < 8) {
			if (getPiece(new Location(file,rank)) instanceof Queen ||
					getPiece(new Location(file,rank)) instanceof Rook) {
				if (getPiece(new Location(file,rank)).getColor() == turn) {
					break;
				} else {
					return true;
				}
			}
			rank++;
		}
		file = loc.getFileByInt();
		rank = loc.getRank()-1;
		while (rank > -1) {
			if (getPiece(new Location(file,rank)) instanceof Queen ||
					getPiece(new Location(file,rank)) instanceof Rook) {
				if (getPiece(new Location(file,rank)).getColor() == turn) {
					break;
				} else {
					return true;
				}
			}
			rank--;
		}
		file = loc.getFileByInt()+1;
		rank = loc.getRank()+1;
		while (file < 8 && rank < 8) {
			if (getPiece(new Location(file,rank)) instanceof Queen ||
					getPiece(new Location(file,rank)) instanceof Bishop) {
				if (getPiece(new Location(file,rank)).getColor() == turn) {
					break;
				} else {
					return true;
				}
			}
			file++;
			rank++;
		}
		file = loc.getFileByInt()+1;
		rank = loc.getRank()-1;
		while (file < 8 && rank > -1) {
			if (getPiece(new Location(file,rank)) instanceof Queen ||
					getPiece(new Location(file,rank)) instanceof Bishop) {
				if (getPiece(new Location(file,rank)).getColor() == turn) {
					break;
				} else {
					return true;
				}
			}
			file++;
			rank--;
		}
		file = loc.getFileByInt()-1;
		rank = loc.getRank()+1;
		while (file > -1 && rank < 8) {
			if (getPiece(new Location(file,rank)) instanceof Queen ||
					getPiece(new Location(file,rank)) instanceof Bishop) {
				if (getPiece(new Location(file,rank)).getColor() == turn) {
					break;
				} else {
					return true;
				}
			}
			file--;
			rank++;
		}
		file = loc.getFileByInt()-1;
		rank = loc.getRank()-1;
		while (file > -1 && rank > -1) {
			if (getPiece(new Location(file,rank)) instanceof Queen ||
					getPiece(new Location(file,rank)) instanceof Bishop) {
				if (getPiece(new Location(file,rank)).getColor() == turn) {
					break;
				} else {
					return true;
				}
			}
			file--;
			rank--;
		}

		file = loc.getFileByInt();
		rank = loc.getRank();

		//King
		if (getPiece(new Location(file+1,rank)) instanceof King
				|| getPiece(new Location(file-1,rank)) instanceof King
				|| getPiece(new Location(file,rank+1)) instanceof King
				|| getPiece(new Location(file,rank-1)) instanceof King
				|| getPiece(new Location(file+1,rank+1)) instanceof King
				|| getPiece(new Location(file+1,rank-1)) instanceof King
				|| getPiece(new Location(file-1,rank+1)) instanceof King
				|| getPiece(new Location(file-1,rank-1)) instanceof King) {
			return true;
		}

		//Knight
		if ((getPiece(new Location(file+1,rank+2)) instanceof Knight &&
				getPiece(new Location(file+1,rank+2)).getColor() != turn)
				|| (getPiece(new Location(file+1,rank-2)) instanceof Knight &&
						getPiece(new Location(file+1,rank-2)).getColor() != turn)
				|| (getPiece(new Location(file+2,rank+1)) instanceof Knight &&
						getPiece(new Location(file+2,rank+1)).getColor() != turn)
				|| (getPiece(new Location(file+2,rank-1)) instanceof Knight &&
						getPiece(new Location(file+2,rank-1)).getColor() != turn)
				|| (getPiece(new Location(file-1,rank+2)) instanceof Knight &&
						getPiece(new Location(file-1,rank+2)).getColor() != turn)
				|| (getPiece(new Location(file-1,rank-2)) instanceof Knight &&
						getPiece(new Location(file-1,rank-2)).getColor() != turn)
				|| (getPiece(new Location(file-2,rank+1)) instanceof Knight &&
						getPiece(new Location(file-2,rank+1)).getColor() != turn)
				|| (getPiece(new Location(file-2,rank-1)) instanceof Knight &&
						getPiece(new Location(file-2,rank-1)).getColor() != turn)) {
			return true;
		}

		//Pawn
		if (turn == "white") {
			if ((getPiece(new Location(file+1,rank+1)) instanceof Pawn &&
					getPiece(new Location(file+1,rank+1)).getColor() != turn)
					|| (getPiece(new Location(file-1,rank+1)) instanceof Pawn &&
							getPiece(new Location(file-1,rank+1)).getColor() != turn)) {
				return true;
			}
		} else {
			if ((getPiece(new Location(file+1,rank-1)) instanceof Pawn &&
					getPiece(new Location(file+1,rank-1)).getColor() != turn)
					|| (getPiece(new Location(file-1,rank-1)) instanceof Pawn &&
							getPiece(new Location(file-1,rank-1)).getColor() != turn)) {
				return true;
			}
		}

		return false;
	}
	
	
	
	*/
	
}


