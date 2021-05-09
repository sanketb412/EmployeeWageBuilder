package employeebuilder;

public class CompanyEmpWage {

	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		// TODO Auto-generated constructor stub
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	public String toString() {
		return "Total Emp Wage for Company: " +company+" is: " +totalEmpWage;
	}

	public int getMaxHoursPerMonth() {
		return maxHoursPerMonth;
	}
	
	public static class EmpWageBuilderArray {

		public static final int PART_TIME = 1;
		public static final int FULL_TIME = 2;
		
		private int numOfCompany = 0;
		private CompanyEmpWage[] companyEmpWageArray;
		
		public EmpWageBuilderArray() {
			companyEmpWageArray = new CompanyEmpWage[5];			
		}

	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}

	private void computeEmpWage() {
		for ( int i=0; i < numOfCompany; i++ ) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= companyEmpWage.getMaxHoursPerMonth() && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	public static void main(String[] args) {
		System.out.println("\n..####...Welcome to Employee Wage Computation...####..");
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart", 20,9,100);
		empWageBuilder.addCompanyEmpWage("Reliance", 25,5,150);
		empWageBuilder.addCompanyEmpWage("Rufilo", 2,10,150);
		empWageBuilder.computeEmpWage();
		}
}
}