
public class Animal {
	private String typeOfAnimal;
	private String name;
	private int age;
	private String gender;
	private String environment;
	private int speed;

	public Animal(String typeOfAnimal, String name, int age, String gender, String environment, int speed) {
		this.typeOfAnimal = typeOfAnimal;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Animal type=" + typeOfAnimal + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", environment=" + environment + ", speed=" + speed + "]";
	}

	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

