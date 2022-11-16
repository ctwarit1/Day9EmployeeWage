package com.bridgelabz;

public class EmployeeWageWithOopsUC8 {

//	instance variable	
	public static int IS_PART_TIME = 0;
	public static int IS_FULL_TIME = 1;

//	static method
	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {

		int empHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpHour = 0;
		int TotalWage;

//		 computation
		while (totalEmpHour <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			double empCheck = Math.floor(Math.random() * 10) % 3;

			switch ((int) empCheck) {
			case 0:
				empHrs = 4;
				break;
			case 1:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHour += empHrs;
			System.out.println("Days: " + totalWorkingDays);
			System.out.println("Emp ours: " + empHrs);
		}
		TotalWage = totalEmpHour * empRatePerHour;
		System.out.println("Total wage is: " + TotalWage);
		return TotalWage;
	}

	public static void main(String[] args) {
		System.out.println("\n Welcome to Employee Wage Computation Program !\n");
		EmployeeWageWithOopsUC8.computeEmpWage("Maruti Suzuki", 30, 20, 90);
		EmployeeWageWithOopsUC8.computeEmpWage("Mahindra Tech", 40, 25, 120);
		EmployeeWageWithOopsUC8.computeEmpWage("Toyota", 50, 18, 90);
	}
}
