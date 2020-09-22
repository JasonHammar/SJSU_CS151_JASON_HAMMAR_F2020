
public class Executive extends Employee {
	double yearlyBonus;
	double yearlyCompensation;

	public Executive() {
		super();
		yearlyBonus = 0;
		yearlyCompensation = 0;
	}

	public Executive(String firstName, String lastName, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double yearlyBonus, double yearlyCompensation) {
		super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
		this.yearlyBonus = yearlyBonus;
		this.yearlyCompensation = yearlyCompensation;
	}

	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	public void introduce(boolean displaySSN) {
		if (displaySSN) {
			System.out.println(toString());
			System.out.println("SSN: " + getSsn());
		}else {
			System.out.println(toString());
		}
	}

	public double getYearlyCompensation() {
		return yearlyCompensation;
	}

	public void setYearlyCompensation(double yearlyCompensation) {
		this.yearlyCompensation = yearlyCompensation;
	}

	public double computePay() {
		return getYearlyCompensation() + getYearlyBonus();
	}

	@Override
	public String toString() {
		return "\nFirst Name: "
				+ firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nAddress: " + address.getStreetNum() + address.getStreetName() + address.getCity()
				+ address.getState() + address.getZip() + "\nYearly Bonus: $" + yearlyBonus + "\nYearly Compensation: $" + yearlyCompensation + "\nID: " + id
				+ "\nEducation Level: " + educationLevel + "\nDirect Deposit: " + directDeposit;
	}

}
