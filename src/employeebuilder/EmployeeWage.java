package employeebuilder;

public class EmployeeWage
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("###..Welcome to Employee Wage Computation..###");
		
		int IS_FULL_DAY = 1;
		int IS_HALF_DAY = 2;
		int emphrf = 8;
		int emphra = 4;
		int empratehr = 20;
		double empCheck = Math.floor(Math.random() * 10) % 3;
	    if (empCheck == IS_FULL_DAY)
	    {
	        System.out.println("\nEmployee is Present Full day \nEmployee Daily Wage in Rupees is:" +emphrf*empratehr);
	    }
	    else if (empCheck == IS_HALF_DAY)
	    {
	    	System.out.println("\nEmployee is Present Half Day \nEmployee Daily Wage in Rupees is:" +emphra*empratehr);
	    }
	    else
	    {
	         System.out.println("\nEmployee is Absent \nEmployee Daily Wage is 0 Rupees");
	    }
	}
}
