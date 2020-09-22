
public class FullTimeHourly extends FullTimeEmployee {
	double overtimePay;

	public FullTimeHourly() {
		super();
	}

	public FullTimeHourly(String firstName, String lastName, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double basePay, double overtimePay) {
		super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit, basePay);
		this.overtimePay = overtimePay;
	}

	public void introduce(boolean displaySSN) {
		if (displaySSN) {
			System.out.println(toString());
			System.out.println("SSN: " + getSsn());
		}else {
			System.out.println(toString());
		}
	}

	public double computePay(float numHours) {
		float overtime = numHours - 40;
		if (overtime > 0) {
			return (float) ((numHours * getBasePay()) + (overtime * getOvertimePay()));
		} else {
			return (float) (numHours * getBasePay());
		}

	}

	public double getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(double overtimePay) {
		this.overtimePay = overtimePay;
	}

	@Override
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age
				+ "\nAddress: " + address.getStreetNum() + address.getStreetName() + address.getCity()
				+ address.getState() + address.getZip() + "\nOvertime Pay: $" + overtimePay + "\nBase Pay: $" + basePay + "\nID: " + id
				+ "\nEducation Level: " + educationLevel + "\nDirect Deposit: " + directDeposit;
	}

}
