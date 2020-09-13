
public class Dog extends Animal implements Domesticated {

	public Dog(String typeOfAnimal, String name, int age, String gender, String environment, int speed) {
		super(typeOfAnimal, name, age, gender, environment, speed);
	}

	@Override
	public String toString() {
		return "Animal type: " + getTypeOfAnimal() + "\nName: " + getName() + "\nAge: " + getAge() + "\nGender: "
				+ getGender() + "\nEnvironment: " + getEnvironment() + "\nSpeed: " + getSpeed();
	}
	
	public void bark() {
		System.out.println("Bark!!!");
	}
}
