
public abstract class Employee {

	protected String name;
	protected String employeeID;
	protected int salary;
	protected int workingMonths;
	protected boolean isMarried;
	protected int childCount;
	

	public Employee(String name, String employeeID, int salary, int workingMonths, boolean isMarried, int childCount) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
		this.workingMonths = workingMonths;
		this.isMarried = isMarried;
		this.childCount = childCount;
	}


	public int getChildCount() {
		return childCount;
	}


	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}


	public boolean isMarried() {
		return isMarried;
	}


	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}


	public int getSalary() {
		return salary;
	}


	public abstract void setSalary(int salary);


	public Employee(String name, String employeeID, int salary, int workingMonths) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
		this.workingMonths = workingMonths;
	}
	
	protected int monthBonus = 0;
	int getMonthBonus(int months) {
		return (monthBonus) * (months/12);
	}
	
	public int getTotalSalary() {
		int totalSalary = 0;
		
		if (workingMonths < 12) {
			totalSalary += getSalary() * workingMonths;
		} else {
			totalSalary += (salary * workingMonths) + (salary * getMonthBonus(workingMonths));
		}
		
		return totalSalary;
	}
	
}
