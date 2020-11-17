import java.util.ArrayList;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList strList = new ArrayList<String>();
		ArrayList intList = new ArrayList<Integer>();
		ArrayList douList = new ArrayList<Double>();
		
		strList.add("sling");
		strList.add("string");
		strList.add("bling");
		strList.add("fling");
		strList.add("ring");
		
		intList.add(1);
		intList.add(34);
		intList.add(5);
		intList.add(8);
		intList.add(9);
		intList.add(0);
		
		douList.add(1.34);
		douList.add(21.54);
		douList.add(89.00);
		douList.add(65.87);
		douList.add(25.87);
		douList.add(67.11);
		douList.add(11.22);
		douList.add(90.01);
		
		System.out.println("Number of String Elements: " + count(strList));
		System.out.println("Number of Integer Elements: " + count(intList));
		System.out.println("Number of Double Elements: " + count(douList));
		
	}
	public static int count(ArrayList list) {
		int counter = 0;
		for(int i = 0; i < list.size(); i++) {
			counter++;
		}
		return counter;
	}
}
