import java.util.ArrayList;

import java.util.Iterator;

public class Student {
	String firstName;
	String lastName;
	int age;
	float gpa;
	String major;
	String department;
	ArrayList<Course> courses = new ArrayList<Course>();

	public Student(String firstName, String lastName, int age, float gpa, String major, String department,
			ArrayList<Course> courses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.courses = courses;
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void removeCourse(Course course) {
		courses.remove(course);
	}

	public ArrayList<Course> sortCourses(boolean ascending) {
		Iterator course = courses.iterator();
		if (ascending) {
			for (int i = 0; i < courses.size(); i++) {
				for (int j = 0; j < courses.size() - i - 1; j++) {
					
					if(courses.get(i).getName().compareTo(courses.get(i).getName()) > 0) {
						Course temp = courses.get(i);
						courses.set(i, courses.get(i + 1));
						courses.set(i + 1, temp);
					}
				}
			}
			return courses;
		} else {
			for (int i = 0; i < courses.size(); i++) {
				for (int j = 0; j < courses.size() - i - 1; j++) {
					
					if(courses.get(i).getName().compareTo(courses.get(i).getName()) < 0) {
						Course temp = courses.get(i);
						courses.set(i, courses.get(i + 1));
						courses.set(i + 1, temp);
					}
				}
			}
			return courses;
		}
	}

}
