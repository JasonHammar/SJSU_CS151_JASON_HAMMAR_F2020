
public class PartTimeHourly extends Employee {
	double baseHourlyPay;

	public PartTimeHourly() {
		super();
		baseHourlyPay = 0;
	}

	public PartTimeHourly(String firstName, String lastName, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double baseHourlyPay) {
		super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
		this.baseHourlyPay = baseHourlyPay;
	}

	public double getBaseHourlyPay() {
		return baseHourlyPay;
	}

	public void setBaseHourlyPay(double baseHourlyPay) {
		this.baseHourlyPay = baseHourlyPay;
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
		float total;
		total = (float) (numHours * getBaseHourlyPay());
		if(numHours > 40) {
			return -1;
		}
		return total;
	}

	@Override
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age
				+ "\nAddress: " + address.getStreetNum() + address.getStreetName() + address.getCity()
				+ address.getState() + address.getZip() + "\nBase Hourly Pay: $" + baseHourlyPay + "\nID: " + id + "\nEducation Level: "
				+ educationLevel + "\nDirect Deposit: " + directDeposit;
	}

}
