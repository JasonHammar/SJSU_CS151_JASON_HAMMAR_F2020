
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("Scratcher and Domesticated", "Tom the Cat", 4, "Male", "House", 9);
		System.out.println(cat.toString());
		cat.greetHuman();
		
		Dog dog = new Dog("Domesticated", "Lucy the Labrador", 2, "Female", "House", 20);
		System.out.println("\n" + dog.toString());
		dog.bark();
		dog.walk();
		
		Raccoon raccoon = new Raccoon("Scratcher and Wild", "Ron the Raccoon", 15, "Male", "Forest", 10);
		System.out.println("\n" + raccoon.toString());
		raccoon.scratch();
		
		Whale whale = new Whale("Swimmer and Wild", "Winnie the Whale", 30, "Female", "Ocean", 25);
		System.out.println("\n" + whale.toString());
		whale.swim();
	}

}
