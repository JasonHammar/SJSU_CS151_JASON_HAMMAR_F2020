
public class Whale extends Animal implements Swimmer {

	public Whale(String typeOfAnimal, String name, int age, String gender, String environment, int speed) {
		super(typeOfAnimal, name, age, gender, environment, speed);
	}

	@Override
	public String toString() {
		return "Animal type: " + getTypeOfAnimal() + "\nName: " + getName() + "\nAge: " + getAge() + "\nGender: "
				+ getGender() + "\nEnvironment: " + getEnvironment() + "\nSpeed: " + getSpeed();
	}
}
