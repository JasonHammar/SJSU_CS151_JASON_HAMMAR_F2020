
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee joe = new Employee("Joe", "Smith", 35, 150, "Male", "102-67-987", "445 Baywood Dr.", "1994253", 60, "part-time");
		Employee lisa = new Employee("Lisa", "Gray", 26, 134, "Female", "445-98-0098", "72 Muir Ave.", "22349867", 110000, "full-time");
		Employee timothy = new Employee("Timothy", "Briggs", 24, 145, "Male", "911-76-2845", "345 Redwood Dr.", "2035753", 80000, "full-time");
		Employee george = new Employee("George", "Wallace", 21, (float) 155.7, "Male", "395-65-9087", "83 Mckinley Dr.", "2067398", 20, "part-time");
		Employee amy = new Employee("Amy", "Student", 41, 120, "Female", "387-21-3957", "5987 Elmhurst Ave.", "4968478", 45, "part-time");
		
		joe.introduce();
		joe.calculatePay(30);
		
		lisa.introduce();
		lisa .calculatePay(2);
		
		timothy.introduce();
		timothy.calculatePay(4);
		
		george.introduce();
		george.calculatePay(25);
		
		amy.introduce();
		amy.calculatePay(45);
		
	}

}
