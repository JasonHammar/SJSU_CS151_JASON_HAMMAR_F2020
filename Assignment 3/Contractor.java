
public class Contractor extends Employee {
	double basePay;

	public Contractor() {
		super();
		basePay = 0;

	}

	public Contractor(String firstName, String lastName, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double basePay) {
		super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
		this.basePay = basePay;
	}

	public void introduce(boolean displaySSN) {
		if (displaySSN) {
			System.out.println(toString());
			System.out.println("SSN: " + getSsn());
		}else {
			System.out.println(toString());
		}
	}

	public double computePay(int numHours) {
		float total;
		total = (float) (numHours * getBasePay());
		return total;
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	@Override
	public String toString() {
		return "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nAddress: " 
				+ address.getStreetNum() + address.getStreetName() + address.getCity()
				+ address.getState() + address.getZip() + "\nBase Pay: $" + basePay + "\nID: " + id
				+ "\nEducation Level: " + educationLevel + "\nDirect Deposit: " + directDeposit;
	}

}
