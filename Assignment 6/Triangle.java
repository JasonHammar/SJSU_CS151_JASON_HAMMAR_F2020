
public class Triangle extends Shape{

	public int base;
	public int height;

	public Triangle(int base, int height) {
		setShape("Triangle");
		this.base = base;
		this.height = height;
	}

	public double computeArea() {
		return (base * height) / 2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

}
