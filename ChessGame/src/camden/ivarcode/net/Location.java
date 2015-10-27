package camden.ivarcode.net;

public class Location {

	private int rank;
	private char file;
	
	public Location(int i, char c) {
		setRank(i);
		setFile(c);
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public char getFile() {
		return file;
	}

	public void setFile(char file) {
		this.file = file;
	}
	
}
