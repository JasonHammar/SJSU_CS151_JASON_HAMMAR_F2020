
public class Hexagon extends Shape{
	int side;

	public Hexagon(int side) {
		setShape("Hexagon");
		this.side = side;
	}

	public double computeArea() {
		return ((3 * Math.sqrt(3)) / 2) * (side * side);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Hexagon [side=" + side + "]";
	}

}
