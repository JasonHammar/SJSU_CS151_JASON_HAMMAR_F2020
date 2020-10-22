import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		Person joe = new Person("Joe", "Smith", 40);
		Person amy = new Person("Amy", "Gold", 32);
		Person tony = new Person("Tony", "Stork", 21);
		Person sean = new Person("Sean", "Irish", 24);
		Person tina = new Person("Tina", "Brock", 28);
		Person lenny = new Person("Lenny", "Hep", 18);
		Iterator list = people.listIterator();
		//System.out.println(list.getFirstName());
		people.add(joe);
		people.add(amy);
		people.add(tony);
		people.add(sean);
		people.add(tina);
		people.add(lenny);

		for (int i = 0; i < people.size(); i++) {
			for (int j = 0; j < people.size() - i - 1; j++) {
				if (people.get(j).getAge() > people.get(j + 1).getAge()) {
					Person temp = people.get(j);
					people.set(j, people.get(j + 1));
					people.set(j + 1, temp);
				}
			}
		}
		//Collections.sort(people);

		System.out.println("People sorted by age ascending: ");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(
					people.get(i).getFirstName() + " " + people.get(i).getLastName() + " " + people.get(i).getAge());
		}

		for (int i = 0; i < people.size(); i++) {
			for (int j = 0; j < people.size() - i - 1; j++) {
				if (people.get(j).getAge() < people.get(j + 1).getAge()) {
					Person temp = people.get(j);
					people.set(j, people.get(j + 1));
					people.set(j + 1, temp);
				}
			}
		}
		System.out.println("\nPeople sorted by age descending: ");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(
					people.get(i).getFirstName() + " " + people.get(i).getLastName() + " " + people.get(i).getAge());
		}
		for (int i = 0; i < people.size(); i++) {
			for (int j = 0; j < people.size() - i - 1; j++) {
				if (people.get(j).getFirstName().compareTo(people.get(j + 1).getFirstName()) > 0) {
					Person temp = people.get(j);
					people.set(j, people.get(j + 1));
					people.set(j + 1, temp);
				}
			}
		}
		System.out.println("\nPeople sorted by First Name Alphabetically ascending: ");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(
					people.get(i).getFirstName() + " " + people.get(i).getLastName() + " " + people.get(i).getAge());
		}
		for (int i = 0; i < people.size(); i++) {
			for (int j = 0; j < people.size() - i - 1; j++) {
				if (people.get(j).getFirstName().compareTo(people.get(j + 1).getFirstName()) < 0) {
					Person temp = people.get(j);
					people.set(j, people.get(j + 1));
					people.set(j + 1, temp);
				}
			}
		}
		System.out.println("\nPeople sorted by First Name Alphabetically descending: ");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(
					people.get(i).getFirstName() + " " + people.get(i).getLastName() + " " + people.get(i).getAge());
		}
		for (int i = 0; i < people.size(); i++) {
			for (int j = 0; j < people.size() - i - 1; j++) {
				if (people.get(j).getLastName().length() > people.get(j + 1).getLastName().length()) {
					Person temp = people.get(j);
					people.set(j, people.get(j + 1));
					people.set(j + 1, temp);
				}
			}
		}
		System.out.println("\nPeople sorted by last name length ascending: ");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(
					people.get(i).getFirstName() + " " + people.get(i).getLastName() + " " + people.get(i).getAge());
		}
		for (int i = 0; i < people.size(); i++) {
			for (int j = 0; j < people.size() - i - 1; j++) {
				if (people.get(j).getLastName().length() < people.get(j + 1).getLastName().length()) {
					Person temp = people.get(j);
					people.set(j, people.get(j + 1));
					people.set(j + 1, temp);
				}
			}
		}
		System.out.println("\nPeople sorted by last name length descending: ");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(
					people.get(i).getFirstName() + " " + people.get(i).getLastName() + " " + people.get(i).getAge());
		}
	}

}
