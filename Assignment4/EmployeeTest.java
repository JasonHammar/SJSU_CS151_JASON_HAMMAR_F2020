
public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		Employee john = new Employee("John", "Smith", "3968574", 35);
		int input = 40;
		try {
			System.out.println("$" + john.computePay(input));
		} catch (NullPointerException e) {
			if (input < 0) {
				try {
					throw new NumberFormatException("Invalid input, cannot have negative numbers.");
				} catch (NumberFormatException err) {
					err.printStackTrace();
				}
			} else if (input > 0) {
				try {
					throw new TooManyHoursWorkedException("Invalid input, cannot work over 40 hours.");
				} catch (TooManyHoursWorkedException err) {
					err.printStackTrace();
				}
			}

		}
		input = 23;
		try {
			System.out.println("$" + john.computePay(input));
		} catch (NullPointerException e) {
			if (input < 0) {
				try {
					throw new NumberFormatException("Invalid input, cannot have negative numbers.");
				} catch (NumberFormatException err) {
					err.printStackTrace();
				}
			} else if (input > 0) {
				try {
					throw new TooManyHoursWorkedException("Invalid input, cannot work over 40 hours.");
				} catch (TooManyHoursWorkedException err) {
					err.printStackTrace();
				}
			}

		}
		input = 1;
		try {
			System.out.println("$" + john.computePay(input));
		} catch (NullPointerException e) {
			if (input < 0) {
				try {
					throw new NumberFormatException("Invalid input, cannot have negative numbers.");
				} catch (NumberFormatException err) {
					err.printStackTrace();
				}
			} else if (input > 0) {
				try {
					throw new TooManyHoursWorkedException("Invalid input, cannot work over 40 hours.");
				} catch (TooManyHoursWorkedException err) {
					err.printStackTrace();
				}
			}

		}
		input = 0;
		try {
			System.out.println("$" + john.computePay(input));
		} catch (NullPointerException e) {
			if (input < 0) {
				try {
					throw new NumberFormatException("Invalid input, cannot have negative numbers.");
				} catch (NumberFormatException err) {
					err.printStackTrace();
				}
			} else if (input > 0) {
				try {
					throw new TooManyHoursWorkedException("Invalid input, cannot work over 40 hours.");
				} catch (TooManyHoursWorkedException err) {
					err.printStackTrace();
				}
			}

		}
		input = -5;
		try {
			System.out.println("$" + john.computePay(input));
		} catch (NullPointerException e) {
			if (input < 0) {
				try {
					throw new NumberFormatException("Invalid input, cannot have negative numbers.");
				} catch (NumberFormatException err) {
					err.printStackTrace();
				}
			} else if (input > 0) {
				try {
					throw new TooManyHoursWorkedException("Invalid input, cannot work over 40 hours.");
				} catch (TooManyHoursWorkedException err) {
					err.printStackTrace();
				}
			}

		}
		input = 45;
		try {
			System.out.println("$" + john.computePay(input));
		} catch (NullPointerException e) {
			if (input < 0) {
				try {
					throw new NumberFormatException("Invalid input, cannot have negative numbers.");
				} catch (NumberFormatException err) {
					err.printStackTrace();
				}
			} else if (input > 0) {
				try {
					throw new TooManyHoursWorkedException("Invalid input, cannot work over 40 hours.");
				} catch (TooManyHoursWorkedException err) {
					err.printStackTrace();
				}
			}

		}

	}

}
