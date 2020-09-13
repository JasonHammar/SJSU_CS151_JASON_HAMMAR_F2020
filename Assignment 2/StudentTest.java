
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("John ", "Smith", 20, (float)3.6, "School of Computer Science", "Computer Science");
		System.out.println("Student information: ");
		System.out.println("First name: " + s.getFirstName());
		System.out.println("Last name: " + s.getLastName());
		System.out.println("Age: " + s.getAge());
		System.out.println("GPA: " + s.getGpa());
		System.out.println("Department: " + s.getDepartment());
		System.out.println("Major: " + s.getMajor());
		System.out.println("\n" + "Schedule: ");
		
		s.printSchedule();
	}

}
