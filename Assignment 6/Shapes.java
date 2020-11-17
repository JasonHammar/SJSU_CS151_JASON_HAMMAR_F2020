import java.util.ArrayList;

public class Shapes {
	private ArrayList<Shape> shapeList;

	public Shapes(ArrayList<Shape> shapeList) {

		this.shapeList = shapeList;
	}

	public void add(Shape shape) {
		shapeList.add(shape);
	}

	public double min() {
		double min = 1000000000;
		Shape minShape = new Shape();
		for (int i = 0; i < shapeList.size(); i++) {
			if (shapeList.get(i).computeArea() < min) {
				min = shapeList.get(i).computeArea();
				minShape = shapeList.get(i);
			}
		}
		System.out.println(minShape.getShape());
		return min;
	}

	public double max() {
		double max = 0;
		Shape maxShape = new Shape();
		for (int i = 0; i < shapeList.size(); i++) {
			if (shapeList.get(i).computeArea() > max) {
				max = shapeList.get(i).computeArea();
				maxShape = shapeList.get(i);
			}
		}
		System.out.println(maxShape.getShape());
		return max;
	}

	public void remove(Shape shape) {
		shapeList.remove(shape);
	}

	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}

	public void compute() {
		for (int i = 0; i < shapeList.size(); i++) {
			System.out.println(shapeList.get(i).computeArea());
		}
	}

	@Override
	public String toString() {
		return "Shapes [shapeList=" + shapeList + "]";
	}

}
