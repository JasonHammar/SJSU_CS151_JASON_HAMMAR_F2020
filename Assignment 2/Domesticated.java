
public interface Domesticated {
	default void walk() {
		System.out.println("Walking");
	}
	
	default void greetHuman() {
		System.out.println("Hello human, please pet me!");
	}
}
