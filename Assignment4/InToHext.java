import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InToHext {

	public static void main(String[] args) throws InputMismatchException{
		System.out.println("Enter a decimal number: ");
		Scanner inp = new Scanner(System.in);
		try {
			int input = inp.nextInt();
			String hex = Integer.toHexString(input);
			System.out.println(input + " converted to hexadecimal is: " + hex);
		}catch(InputMismatchException e) {
			System.out.println("invalid value type");
			e.printStackTrace();
		}
		
		

	}

}
