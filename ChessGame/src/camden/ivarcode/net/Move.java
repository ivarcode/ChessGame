package camden.ivarcode.net;

public class Move {
	
	private Location src;
	private Location dest;
	
	public Move(Location src, Location dest) {
		setSrc(src);
		setDest(dest);
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
		System.out.println(""+src.getFile()+(src.getRank()+1)+
				" --> "+dest.getFile()+(dest.getRank()+1));
	}

}
