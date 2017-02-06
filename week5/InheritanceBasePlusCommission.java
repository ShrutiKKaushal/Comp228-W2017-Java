package week5;

public class InheritanceBasePlusCommission extends CommissionEmployee {
	
	private double baseSalary;
	
	public InheritanceBasePlusCommission(String firstName, String lastName, String socialSecurityNumber, double grossSale,
			double commissionRate, double baseSalary) {
		
		super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
		
		//Validate Base Salary
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary (double baseSalary){
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
	}
	public double getBaseSalary(){
		return baseSalary;
	}
	
	@Override
	public double earnings(){
		return baseSalary  + super.earnings();//Calling super class earnings methods to avoid redundancy
	}
	
	@Override
	public String toString(){
		 return String.format("%s %s%n%s: %.2f", "Base-Salaried Employee", super.toString(), "base Salary", getBaseSalary());
	}
}
