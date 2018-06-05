
public class Staff extends Employee {

	public Staff(String name, String employeeID, int salary, int workingMonths, boolean isMarried, int childCount) {
		super(name, employeeID, salary, workingMonths, isMarried, childCount);
		this.monthBonus = 3;
		// TODO Auto-generated constructor stub
	}
/*
	int monthBonus = 3;
	int getMonthBonus(int months) {
		return (monthBonus) * (months/12);
	}
	
	@Override
	public int getTotalSalary() {
		int totalSalary = 0;
		
		if (workingMonths < 12) {
			totalSalary += salary * workingMonths;
		} else {
			totalSalary += (salary * workingMonths) + (salary * getMonthBonus(workingMonths));
		}
		
		return totalSalary;
	}*/

	
	@Override
	public void setSalary(int salary) {
		if (salary >= 4000000 && salary <= 6000000)
			this.salary = salary;
	}
}
