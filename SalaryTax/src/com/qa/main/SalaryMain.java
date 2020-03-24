package com.qa.main;

public class SalaryMain {
	public String employeeName(String str) {
		return str;
	}
	
	public double retunSalary(double salaryPerYear, double month, double day) {
		double monthCalc = salaryPerYear / 12;
		double dayCalc = salaryPerYear / 365;
		System.out.println("Yor salary per year: " + salaryPerYear 
				+ "Your wage per Month" + monthCalc
				+ "Your wage per day" + dayCalc);
		return salaryPerYear;
	}
	
	public double returnTax(double wageInput) {
		double wageAfterTax;
		if (wageInput <= 21000) {
			
			System.out.println("You fall into the lowest tax bracket poor man!");
		}
		else if (wageInput <= 21000 && wageInput <= 32500) {
			System.out.println("Good Job You're in the middle range slightly poor man!");
			
		}
		else if (wageInput > 325000) {
			System.out.println("Good Job, Boris loves you!");			
		}
		return 0.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Name";
		SalaryMain calll = new SalaryMain();
		calll.employeeName(name);
		calll.returnSalary(23500.0, 10.0, 26.0);
	
	}

}
