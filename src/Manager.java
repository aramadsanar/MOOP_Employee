
public class Manager extends Employee {

	public Manager(String name, String employeeID, int salary, int workingMonths, boolean isMarried, int childCount) {
		super(name, employeeID, salary, workingMonths, isMarried, childCount);
		this.monthBonus = 5;
		// TODO Auto-generated constructor stub
	}

	/*int getMonthBonus(int months) {
		return (monthBonus) * (months/12);
	}
	
	@Override
	public int getTotalSalary() {
		int totalSalary = 0;
		
		if (workingMonths < 12) {
			totalSalary += getSalary() * workingMonths;
		} else {
			totalSalary += (salary * workingMonths) + (salary * getMonthBonus(workingMonths));
		}
		
		return totalSalary;
	}*/

	
	@Override
	public void setSalary(int salary) {
		if (salary >= 10000000 && salary <= 20000000)
			this.salary = salary;
	}
}
