package employeebuilder;

public class EmployeeWage {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;

	public static int EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) (Math.random() * 10 % 3);
			switch (empCheck) {
			case PART_TIME:
				empHrs = 4;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "  Emp Hr: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("\nTotal Emp Wage for Company " + company + " is: " + totalEmpWage + "\n");
		System.out.println("------------------------------------------------");
		return totalEmpWage;
	}

	public static void main(String[] args) {
		System.out.println("\n..####...Welcome to Employee Wage Computation...####..");
		EmpWage("DMart", 20, 20, 100);
		EmpWage("Reliance", 30, 15, 150);
	}
}
