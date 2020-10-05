
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c = new Course("CS 151", ", Object Oriented Design and Programming", ", CS", ", 6:00PM", ", Tues.");
		Student s = new Student("John ", "Smith", 20, (float)3.6, "School of Computer Science", "Computer Science", c);
		Student copyS = new Student(s);
		
		s.printInfo();
		copyS.printInfo();
	}

}
