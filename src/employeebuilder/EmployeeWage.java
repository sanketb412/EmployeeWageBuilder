package employeebuilder;

public class EmployeeWage
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("###..Welcome to Employee Wage Computation..###");

		int emphrf = 8;
		int emphra = 4;
		int empratehr = 20;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		int IntValue = (int) Math.round(empCheck);
	      switch (IntValue)
	      {
	      	case 1: System.out.println("\nEmployee is Present Full Day \nEmployee Daily Wage in Rupees is:" +emphrf*empratehr); break;
	      	case 2: System.out.println("\nEmployee is Present Half Day \nEmployee Daily Wage in Rupees is:" +emphra*empratehr); break;
	      	case 0: System.out.println("\nEmployee is Absent \nEmployee Daily Wage is 0 Rupees"); break;
	      }	         
	 }
}
