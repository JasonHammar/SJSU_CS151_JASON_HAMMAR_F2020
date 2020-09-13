
public class Raccoon extends Animal implements Scratcher{
	public Raccoon(String typeOfAnimal, String name, int age, String gender, String environment, int speed) {
		super(typeOfAnimal, name, age, gender, environment, speed);
	}
	@Override
	public String toString() {
		return "Animal type: " + getTypeOfAnimal() + "\nName: " + getName() + "\nAge: " + getAge() + "\nGender: " + getGender()
				+ "\nEnvironment: " + getEnvironment() + "\nSpeed: " + getSpeed();
	}
}
