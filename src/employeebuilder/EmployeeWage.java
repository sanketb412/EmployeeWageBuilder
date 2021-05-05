package employeebuilder;

import java.util.Scanner;

public class EmployeeWage {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;

	private String company;
	private int empRatePerHour;
	private int numOfWorkingDays;
	private int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
	this.company = company;
	this.empRatePerHour = empRatePerHour;
	this.numOfWorkingDays = numOfWorkingDays;
	this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	public void computeEmpWage() {
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
	}

	public static void main(String[] args) {
		System.out.println("\n..####...Welcome to Employee Wage Computation...####..");
		EmployeeWage dMart = new EmployeeWage("Dmart", 20,29,100);		
		dMart.computeEmpWage();
		System.out.println(dMart);
		}
}
