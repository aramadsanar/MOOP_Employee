
public class Director extends Employee {

	public Director(String name, String employeeID, int salary, int workingMonths, boolean isMarried, int childCount) {
		super(name, employeeID, salary, workingMonths, isMarried, childCount);
		this.monthBonus = 7;
		// TODO Auto-generated constructor stub
	}
	/*int monthBonus = 7;
	int getMonthBonus(int months) {
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
		if (salary >= 30000000 && salary <= 50000000)
			this.salary = salary;
	}
}
