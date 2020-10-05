
public class Employee {
	
	private String firstName;
	private String lastName;
	private String employeeId;
	private int hourlyPay;

	public Employee(String firstName, String lastName, String employeeId, int hourlyPay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.hourlyPay = hourlyPay;
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

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public int getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public double computePay(float numHours) throws NullPointerException {

		if (numHours < 0) {
			return (Double) null;
		} else if (numHours > 40) {
			return (Double) null;
		} else {
			return (float) ((numHours * getHourlyPay()));
		}
		

	}

}


