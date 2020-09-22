
public class BusinessTest {

	public static void main(String[] args) {
		Address chadAddress = new Address(345, " Freedom Drive", " Cupertino, ", "95014", "California, ");
		Customer chad = new Customer("Chad", "Wallace", 24, "576-48-3287", chadAddress, 1298674, "Cash");
		chad.introduce();
		chad.makePayment();
		System.out.println();

		Address emilyAddress = new Address(8675, " Redwood Avenue ", "Santa Clara, ", "95051", "California, ");
		Customer emily = new Customer("Emily", "Rose", 38, "687-93-2857", emilyAddress, 6587674, "Credit Card");
		emily.introduce();
		emily.makePayment();
		System.out.println();

		Address jonAddress = new Address(2401, " Agnew Road", " Santa Clara, ", "95054", "California, ");
		Contractor jon = new Contractor("Jon", "Smith", 45, "633-38-0988", jonAddress, 5867452, "Master's degree", true,
				40);
		jon.introduce(true);
		System.out.println("Jon's total Pay for 80 hours is $" + jon.computePay(80));
		System.out.println();

		Address billAddress = new Address(5663, " Arthur Street", " San Jose, ", "95029", "California, ");
		Contractor bill = new Contractor("Bill", "Burton", 50, "599-21-6878", billAddress, 6877356, "Bachelor's degree",
				false, 35);
		bill.introduce(false);
		System.out.println("Bill's total Pay for 80 hours is $" + bill.computePay(40));
		System.out.println();

		Address ericAddress = new Address(115, " Rodonavan Drive", " Santa Clara, ", "95051", "California, ");
		Executive eric = new Executive("Eric", "Chavez", 51, "123-45-6789", ericAddress, 9587643, "Master's Degree",
				true, 100000, 50000);
		eric.introduce(true);
		System.out.println("Eric's total Pay is $" + eric.computePay());
		System.out.println();

		Address karenAddress = new Address(666, " Pomeroy Avenue", " Santa Clara, ", "95051", "California, ");
		Executive karen = new Executive("Karen", "Butler", 60, "987-65-4321", karenAddress, 1234567, "Phd", false,
				125000, 75000);
		karen.introduce(false);
		System.out.println("Karen's total Pay is $" + karen.computePay());
		System.out.println();

		Address markAddress = new Address(23, " Lincoln Avenue", " San Jose, ", "95049", "California, ");
		FullTimeHourly mark = new FullTimeHourly("Mark", "Riley", 37, "456-76-3324", markAddress, 9987765,
				"Bachelor's Degree", true, 30, 45);
		mark.introduce(true);
		System.out.println("Mark's total pay for 80 hours is: $" + mark.computePay(48));
		System.out.println();
		
		Address kimAddress = new Address(345, " Acacia Street", " Shafter, ", "93263", "California, ");
		FullTimeHourly kim = new FullTimeHourly("Kim", "Barnett", 29, "231-65-8987", kimAddress, 88765432,
				"Master's Degree", false, 35, 50);
		kim.introduce(false);
		System.out.println("Mark's total pay for 40 hours is: $" + kim.computePay(40));
		System.out.println();
		
		Address reyAddress = new Address(561, " Benton Street", " Santa Clara, ", "95050", "California, ");
		FullTimeSalaried rey = new FullTimeSalaried("Rey", "Valui", 34, "999-88-777", reyAddress, 9657432,
				"Master's Degree", true, 80000);
		rey.introduce(true);
		System.out.println("Rey's total pay for 3 Weeks is: $" + rey.computePay(3));
		System.out.println();
		
		Address margeAddress = new Address(3456, " Homestead Road", " Cupertino, ", "95014", "California, ");
		FullTimeSalaried marge = new FullTimeSalaried("Marge", "Lee", 27, "555-32-1234", margeAddress, 34567891,
				"Bachelor's Degree", false, 75000);
		marge.introduce(false);
		System.out.println("Marge's total pay for 5 Weeks is: $" + marge.computePay(5));
		System.out.println();
		
		Address cassidyAddress = new Address(101, " Walter Hayes Drive", " Palo Alto, ", "94301", "California, ");
		PartTimeHourly cassidy = new PartTimeHourly("Cassidy", "Waters", 23, "234-12-1231", cassidyAddress, 7786654,
				"Bachelor's Degree", true, 25);
		cassidy.introduce(true);
		System.out.println("Cassidy's total pay for 40 hours is: $" + cassidy.computePay(40));
		System.out.println();
		
		Address stanleyAddress = new Address(1011, " Stevens Creek Boulevard", " Cupertino, ", "95014", "California, ");
		PartTimeHourly stanley = new PartTimeHourly("Stanley", "Ferguson", 21, "556-78-9143", stanleyAddress, 5643286,
				"Bachelor's Degree", false, 20);
		stanley.introduce(false);
		System.out.println("Cassidy's total pay for 41 hours is: $" + stanley.computePay(41));
		System.out.println();

	}

}
