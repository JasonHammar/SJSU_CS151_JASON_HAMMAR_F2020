import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Shape> shapeList = new ArrayList<Shape>();

		Triangle tri1 = new Triangle(10, 15);
		shapeList.add(tri1);
		Triangle tri2 = new Triangle(6, 13);
		shapeList.add(tri2);
		Circle cir1 = new Circle(7);
		shapeList.add(cir1);
		Circle cir2 = new Circle(9);
		shapeList.add(cir2);
		Hexagon hex1 = new Hexagon(12);
		shapeList.add(hex1);
		Hexagon hex2 = new Hexagon(7);
		shapeList.add(hex2);
		Rectangle rect1 = new Rectangle(12, 5);
		shapeList.add(rect1);
		Rectangle rect2 = new Rectangle(7, 21);
		shapeList.add(rect2);
		Shapes shapes = new Shapes(shapeList);
		shapes.compute();
		System.out.println(shapes.max());
		System.out.println(shapes.min());
		for (int i = 1; i <= 8; i++) {
			File outfile = new File("obj" + i);
			PrintWriter out = new PrintWriter(outfile);
			out.println(shapeList.get(i - 1));
			out.println("Area: " + shapeList.get(i - 1).computeArea());

			out.close();
		}
	}

}
