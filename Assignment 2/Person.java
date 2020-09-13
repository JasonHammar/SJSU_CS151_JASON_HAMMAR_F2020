
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private float weight;
	private String gender;
	private String socialSecurity;
	private String address;

	public Person(String firstName, String lastName, int age, float weight, String gender, String socialSecurity,
			String address) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.socialSecurity = socialSecurity;
		this.address = address;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "First name: " + firstName + "\nLast name: " + lastName + "\nAge: " + age + "\nWeight: " + weight
				+ "\nGender: " + gender + "\nSocial Security: " + socialSecurity + "\nAddress: " + address;
	}

	public void introduce() {
		System.out.println(toString());
	}
}
