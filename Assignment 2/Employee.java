
public class Employee extends Person {
	String employeeID;
	float payAmount;
	String employeeStatus;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public float getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(float payAmount) {
		this.payAmount = payAmount;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public Employee(String firstName, String lastName, int age, float weight, String gender, String socialSecurity,
			String address, String employeeId, int payAmount, String employeeStatus) {
		super(firstName, lastName, age, weight, gender, socialSecurity, address);

		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setWeight(weight);
		setGender(gender);
		setSocialSecurity(socialSecurity);
		setAddress(address);

		this.employeeID = employeeId;
		this.payAmount = payAmount;
		this.employeeStatus = employeeStatus;
		// TODO Auto-generated constructor stub

	}

	@Override
	public void introduce() {
		System.out.println(super.toString());
		System.out.print("Employee ID: " + employeeID + "\n" + "Employee status: " + employeeStatus + "\n"
				+ "Employee pay amount: $" + payAmount);
		if (employeeStatus.equals("part-time")) {
			System.out.println("/hr\n");
		} else {
			System.out.println("/yr\n");
		}
	}

	public void calculatePay(float timeWorked) {
		float total = 0;
		if (employeeStatus.equals("part-time")) {
			total = timeWorked * payAmount;
			System.out.println(super.getFirstName() + "'s total for working " + timeWorked + " hours is $" + total + "\n");
		} else if (employeeStatus.equals("full-time")) {

			total = (payAmount * (timeWorked / 52));
			System.out.println(super.getFirstName() + "'s total for working " + timeWorked + " weeks are $" + total + "\n");
		}
	}

}
