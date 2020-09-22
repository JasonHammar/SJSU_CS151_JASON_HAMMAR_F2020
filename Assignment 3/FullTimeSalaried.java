
public class FullTimeSalaried extends FullTimeEmployee {
	public FullTimeSalaried() {
		super();
	}

	public FullTimeSalaried(String firstName, String lastName, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double basePay) {
		super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit, basePay);

	}

	@Override
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age
				+ "\nAddress: " + address.getStreetNum() + address.getStreetName() + address.getCity()
				+ address.getState() + address.getZip() + "\nBase Pay: " + basePay + "\nID: " + id + "\nEducation Level: "
				+ educationLevel + "\nDirect Deposit: " + directDeposit;
	}

	public void introduce(boolean displaySSN) {
		if (displaySSN) {
			System.out.println(toString());
			System.out.println("SSN: " + getSsn());
		}else {
			System.out.println(toString());
		}
	}

	public double computePay(float numWeeks) {
		float total;
		total = (float) (getBasePay() * (numWeeks / 52));
		return total;
	}
}
