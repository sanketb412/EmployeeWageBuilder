package employeebuilder;

public class EmployeeWage
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
	
	public static int EmpWage()
	{
		int empHrs=0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10  % 3);
			switch (empCheck)
			{
	      		case IS_PART_TIME: 
	      			empHrs = 4; break;
	      		case IS_FULL_TIME:
	      			empHrs = 8; break;
	      		default:
	      			empHrs = 0; break;
			}
			totalEmpHrs += empHrs;
	    }
		totalWorkingDays = totalEmpHrs * EMP_RATE_PER_HOUR;
		return totalWorkingDays;
	 }
	public static void main(String[] args)
	{	
		System.out.println("\n..####...Welcome to Employee Wage Computation...####..");
		System.out.println("\n\t\tTotal Emp Salary: " +EmpWage());
	}
}
