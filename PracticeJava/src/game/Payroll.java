package game;

public class Payroll {
	private String name;
	private int idNumber;
	private double payRate;
	private double hoursWorked;
	
	public Payroll(String n, int i) {
		name = n;
		idNumber = i;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double getGrossPay() {
		return hoursWorked * payRate;
		
	}
	
	

}
