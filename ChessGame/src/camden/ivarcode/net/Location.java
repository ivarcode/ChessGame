package camden.ivarcode.net;

public class Location {

	private int rank;
	private char file;
	
	public Location(int rank, char file) {
		setRank(rank);
		setFile(file);
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

	public int getFileByInt() {
		int i = -1; //throws error if case not 'a'-'h'
		switch (file) {
			case 'a':	i = 0;
			case 'b':	i = 1;
			case 'c':	i = 2;
			case 'd':	i = 3;
			case 'e':	i = 4;
			case 'f':	i = 5;
			case 'g':	i = 6;
			case 'h':	i = 7;
		}
		return i;
	}
	
	public void printLoc() {
		System.out.println(file + (rank+1));
	}
	
}
