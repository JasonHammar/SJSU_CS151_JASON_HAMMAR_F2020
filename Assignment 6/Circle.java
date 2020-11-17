
public class Circle extends Shape{
	public int radius;
	public double pi = 3.14;

	public Circle(int radius) {

		this.radius = radius;
		setShape("Circle");
	}

	public double computeArea() {
		return pi * (radius * radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", pi=" + pi + "]";
	}

}
