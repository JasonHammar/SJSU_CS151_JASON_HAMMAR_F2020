import java.io.*;
import java.util.Scanner;
public class ReadFileInput {

	public static void main(String[] args) throws IOException{
		
		Scanner inp = new Scanner(System.in);
		String filename = "quote.txt";
		
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
