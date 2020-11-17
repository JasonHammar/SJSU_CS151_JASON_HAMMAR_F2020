
public class Rectangle extends Shape{
	public int width;
	public int length;

	public Rectangle(int width, int length) {
		setShape("Rectangle");
		this.width = width;
		this.length = length;
	}

	public double computeArea() {
		return length * width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

}
