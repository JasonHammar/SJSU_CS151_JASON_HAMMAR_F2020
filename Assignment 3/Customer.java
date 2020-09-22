
public class Customer extends Person {
	int customerId;
	String paymentPreference;
	
	public Customer(){
		super();
		customerId = 0;
		paymentPreference = null;
	}

	public Customer(String firstName, String lastName, int age, String ssn, Address address, int customerId,
			String paymentPreference) {
		super(firstName, lastName, age, ssn, address);
		this.customerId = customerId;
		this.paymentPreference = paymentPreference;
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPaymentPreference() {
		return paymentPreference;
	}
	
	public void introduce() {
		System.out.println(toString());
	}
	
	public void setPaymentPreference(String paymentPreference) {
		this.paymentPreference = paymentPreference;
	}
	
	public void makePayment() {
		System.out.println(getFirstName() + " has paid in " + getPaymentPreference());
	}

	@Override
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nAddress: " + address.getStreetNum()
				+ address.getStreetName() + address.getCity() + address.getState() + address.getZip()
				+ "\nCustomer ID: " + customerId + "\nPayment Preference: " + paymentPreference; 
	}
	
	
}
