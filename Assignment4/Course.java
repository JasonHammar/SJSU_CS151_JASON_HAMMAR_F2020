
public class Course implements Cloneable{
	private String name;
	private String description;
	private String department;
	private String startTime;
	private String dayOfInstruction;

	public Course(String name, String description, String department, String startTime, String dayOfInstruction) {
		this.name = name;
		this.description = description;
		this.department = department;
		this.startTime = startTime;
		this.dayOfInstruction = dayOfInstruction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getDayOfInstruction() {
		return dayOfInstruction;
	}

	public void setDayOfInstruction(String dayOfInstruction) {
		this.dayOfInstruction = dayOfInstruction;
	}

}
