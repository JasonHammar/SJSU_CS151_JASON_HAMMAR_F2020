class Student {
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String department;
	private String major;

	public Student() {
		firstName = "";
		lastName = "";
		age = 0;
		gpa = 0;
		department = "";
	}

	public Student(String firstName, String lastName, int age, float gpa, String department, String major) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.department = department;
		this.major = major;
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

	public void printSchedule() {
		Schedule s = new Schedule();
		s.printSchedule();
	}

	private class Schedule {

		public void printSchedule() {
			System.out.println("CS 151 Tues/Thur 6-7:15\nCS 147 Mon/Wed 7:30-8:45\nCS 146 Mon/Wed 1:30-2:45");
		}
	}
}
