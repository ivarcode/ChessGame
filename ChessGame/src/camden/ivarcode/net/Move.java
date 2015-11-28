package camden.ivarcode.net;

public class Move {
	
	private Location src;
	private Location dest;
	private String move;
	
	public Move(Location src, Location dest) {
		setSrc(src);
		setDest(dest);
		setRecord(null);
	}

	public Location getSrc() {
		return src;
	}

	public void setSrc(Location src) {
		this.src = src;
	}

	public Location getDest() {
		return dest;
	}

	public void setDest(Location dest) {
		this.dest = dest;
	}
	
	public void print() {
		//TODO print book move or print this if bookmove == null
		System.out.println(""+src.getFile()+(src.getRank()+1)+
				" --> "+dest.getFile()+(dest.getRank()+1));
	}

	public String getRecord() {
		return move;
	}

	public void setRecord(String move) {
		this.move = move;
	}

}
