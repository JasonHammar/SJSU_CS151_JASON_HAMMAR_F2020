
public abstract class FullTimeEmployee extends Employee {
	double basePay;

	public FullTimeEmployee() {
		super();
		basePay = 0;
	}

	public FullTimeEmployee(String firstName, String lastName, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double basePay) {
		super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
		this.basePay = basePay;
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

}
