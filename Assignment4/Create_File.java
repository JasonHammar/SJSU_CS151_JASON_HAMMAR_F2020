import java.io.*;
import java.util.Scanner;

public class Create_File {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String filename = "command_line_input.txt";

		try {
			File outfile = new File(filename);
			Scanner command = new Scanner(outfile);
			PrintWriter output = new PrintWriter(outfile);
			System.out.println("Please enter a command.");
			String inp = input.nextLine();
			String string = "@q";
			while (true) {
				if (inp.equals(string)) {
					output.println(inp);
					output.close();
					System.out.println("Program ended, goodbye!");
					break;
				}
				output.println(inp);
				System.out.println("Command entered, Please enter a command.");
				inp = input.nextLine();
				
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error, file not found");
			e.printStackTrace();
		}

	}

}
