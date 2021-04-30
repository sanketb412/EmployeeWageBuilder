package employeebuilder;

public class EmployeeWage
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("###..Welcome to Employee Wage Computation..###");
		
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
	    if (empCheck == IS_FULL_TIME)
	    {
	         System.out.println("\nEmployee is Present Full day");
	    }
	    else
	    {
	         System.out.println("\nEmployee is Absent");
	    }
	    int emphr = 8;
	      int empratehr = 20;
	      int a;
	      if (empCheck == 1)
	      	{
	    	  a = emphr * empratehr;	    	  
	    	  System.out.println("The Daily Wages of a empolyee in Rupees is: " +a);
	      	}  

	}

}
