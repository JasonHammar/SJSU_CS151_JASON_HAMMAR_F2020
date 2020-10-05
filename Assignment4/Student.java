

public class Student implements Cloneable{
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String department;
	private String major;
	private Course course;

	public Student() {
		firstName = "";
		lastName = "";
		age = 0;
		gpa = 0;
		department = "";
	}
	
	public Student(Student s) {
		this.firstName = s.firstName;
		this.lastName = s.lastName;
		this.age = s.age;
		this.gpa = s.gpa;
		this.department = s.department;
		this.major = s.major;
		this.course = s.course;
	}

	public Student(String firstName, String lastName, int age, float gpa, String department, String major, Course c) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.department = department;
		this.major = major;
		this.course = c;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void printInfo() {
		Info s = new Info();
		s.printInfo();
	}

	private class Info {

		public void printInfo() {
			System.out.println("Student information: ");
			System.out.println("First name: " + getFirstName());
			System.out.println("Last name: " + getLastName());
			System.out.println("Age: " + getAge());
			System.out.println("GPA: " + getGpa());
			System.out.println("Department: " + getDepartment());
			System.out.println("Major: " + getMajor());
			System.out.println("\n" + "Course: " + course.getName() + course.getDescription() + course.getDepartment() + course.getStartTime() + course.getDayOfInstruction());
			System.out.println();
		}
	}
}
