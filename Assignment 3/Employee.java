
public abstract class Employee extends Person {
	int id;
	String educationLevel;
	boolean directDeposit;

	public Employee() {
		super();
		id = 0;
		educationLevel = null;
		directDeposit = false;
	}

	public Employee(String firstName, String lastName, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit) {
		super(firstName, lastName, age, ssn, address);
		this.id = id;
		this.educationLevel = educationLevel;
		this.directDeposit = directDeposit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public boolean isDirectDeposit() {
		return directDeposit;
	}

	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}

}
